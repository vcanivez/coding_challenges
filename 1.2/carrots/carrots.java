import java.util.Scanner;

public class carrots
{
   public static void main(String[] args)
   {

      Scanner scan = new Scanner(System.in);
      int N = scan.nextInt();
      int P = scan.nextInt();

      int i = 0;
      while (i < N)
      {
         if (!scan.nextLine().isEmpty())
         i++;
      }

      System.out.println(P);
   }
}
