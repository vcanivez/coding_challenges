import java.util.Scanner;

public class newalpha
{
   public static void main(String[] args) {

      String[] alphabet = "@ 8 ( |) 3 # 6 [-] | _| |< 1 []\\/[] []\\[] 0 |D (,) |Z $ '][' |_| \\/ \\/\\/ }{ `/ 2".split(" ");
      Scanner scan = new Scanner(System.in);
      String msg = scan.nextLine();
      //String msg = "What's the Frequency, Kenneth?";
      int size = msg.length();
      msg = msg.toLowerCase();
      for (int j = 0; j < size; j++)
      {
         int xVal = (int)msg.charAt(j);
         if (xVal <= 122 && xVal >= 97)
         {
            xVal = xVal - 97;
            String newChar = alphabet[xVal];
            String start = msg.substring(0, j);
            String end = msg.substring(j + 1);
            msg = start + newChar + end;
            size = msg.length();
         }
      }
      System.out.println(msg);
   }
}
