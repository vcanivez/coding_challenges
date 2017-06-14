import java.util.Scanner;

public class oddities
{
   public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);

      int n = scan.nextInt();

      for (int i = 0; i < n; i++)
      {
         int x = scan.nextInt();
         if (x % 2 != 0)
         {
            System.out.println(x + " is odd");
         }
         else
         {
            System.out.println(x + " is even");
         }
      }
   }
}
