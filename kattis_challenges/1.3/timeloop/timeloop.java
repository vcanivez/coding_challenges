import java.util.Scanner;

public class timeloop
{
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int N = scan.nextInt();

      for (int i = 0; i < N; i++)
      {
         System.out.println((i + 1) + " Abracadabra");
      }
   }
}
