import java.util.Scanner;

public class coldputer
{
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      int total = 0;
      for (int i = 0; i < n; i++)
      {
         if (scan.nextInt() < 0)
         {
            total++;
         }
      }
      System.out.println(total);
   }
}
