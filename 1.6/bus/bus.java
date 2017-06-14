import java.util.Scanner;

public class bus
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int N = scan.nextInt();

      for (int i = 0; i < N; i++)
      {
         int passenger = 1;
         int prPass = 1;
         int k = scan.nextInt();
         for (int j = 1; j < k; j++)
         {

            prPass = prPass * 2;
            passenger += prPass;
         }
         System.out.println(passenger);
      }
   }
}
