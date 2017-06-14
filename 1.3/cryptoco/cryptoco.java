// Cryptographer's Conundrum
import java.util.Scanner;

public class cryptoco
{
   public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);

      String cipher = scan.next();
      int size = cipher.length();
      int days = 0;
      for (int i = 0; i < size; i++)
      {
         if ((i + 1) % 3 == 1)
         {
            if (cipher.charAt(i) != 'P')
            {
               days++;
            }
         }
         else if ((i + 1) % 3 == 2)
         {
            if (cipher.charAt(i) != 'E')
            {
               days++;
            }
         }
         else
         {
            if (cipher.charAt(i) != 'R')
            {
               days++;
            }
         }
      }
      System.out.println(days);
   }
}
