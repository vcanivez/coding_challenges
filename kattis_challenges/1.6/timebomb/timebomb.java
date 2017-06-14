import java.util.Scanner;
import java.io.File;
import java.io.*;

public class timebomb
{
   public static void main(String[] args) throws IOException{

      //File file = new File("timebomb4.txt");
      Scanner scan = new Scanner(System.in);

      String allNumbers = "***   * *** *** * * *** *** *** *** *** * *   *   *   ";
      allNumbers += "* * * *   *     * * * * * * *   * *** *** *** *** ***   * *** *** * *   * *     ";
      allNumbers += "*   *   * * *   * * *   * ***   * *** ***   * *** ***   * *** ***";

      //Scanner scan = new Scanner(file);
      String line = scan.nextLine();
      int lineSize = line.length();
      //System.out.println(lineSize);

      // calculate # of columns
      int nColumns = lineSize / 4 + 1;
      //System.out.println(nColumns);

      for (int i = 0; i < 4; i++)
      {
         line += " " + scan.nextLine();
      }
      //System.out.println(line);
      //System.out.println(line.length());
      Numbers code = new Numbers(line,nColumns);
      String[] codeMsg = code.getArray();
      Numbers num = new Numbers(allNumbers, 10);
      String[] numbers = num.getArray();

      String numLit = "";
      for (int i = 0; i < nColumns; i++)
      {

         int numInd = num.getValue(codeMsg[i]);
         if (numInd == -1)
         {
            System.out.println("BOOM!!");
            System.exit(0);
         }
         numLit += numInd;
      }
      int numInt = Integer.parseInt(numLit);
      if (numInt % 6 == 0)
      {
         System.out.println("BEER!!");
         System.exit(0);
      }
      else
      {
         System.out.println("BOOM!!");
      }
   }
}

class Numbers
{
   String[] arr = new String[1];
   int nColumns;
   Numbers(String lineIn, int nColumnsIn)
   {
      nColumns = nColumnsIn;
      arr = new String[nColumnsIn];
      // initialize array
      for (int i = 0; i < nColumnsIn; i++)
      {
        arr[i] = "";
      }
      setNumbers(lineIn, nColumnsIn);
   }

   void setNumbers(String line, int nColumns)
   {
      int aNumber = -1;
      int codeSize = line.length();
      for (int i = 0; i <= codeSize; i++)
      {
         if (i % 4 == 0)
         {
            aNumber++;
         }
         else
         {
            arr[aNumber % nColumns] = arr[aNumber % nColumns] + line.charAt(i - 1);
         }
      }
   }

   String[] getArray()
   {
      return arr;
   }

   boolean isNumber(String s)
   {
      for (String number: arr)
      {
         if (number.equals(s))
         {
            return true;
         }
      }
      return false;
   }

   int getValue(String s)
   {
      int value = 0;
      while (value < nColumns)
      {
         if (!arr[value].equals(s))
         {
            value++;
         }
         else
         {
            return value;
         }
      }
      return -1;
   }
}
