import java.util.Scanner;

public class Reverse_Rot {

    /** Drives execution. */
    public static void main(String[] args)  {

      // read argument from standard in
      //*****************************
      Scanner scan = new Scanner(System.in);
      int shift = scan.nextInt();
      while (shift != 0)
      {
         String s = scan.next();
         String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_.";

         String out = "";
         String out2 = "";

         int len = s.length();

         int i = len -1;
         while (i >= 0)
         {
            out += s.charAt(i);
            i--;
         }

         i = 0;
         while (i < len)
         {
            char currentChar = out.charAt(i);

            int index = alphabet.indexOf(currentChar) + shift;
            index = index % 28;
            out2 += alphabet.charAt(index);
            i++;
         }

         System.out.println(out2);

         shift = scan.nextInt();
      }
    }
}
