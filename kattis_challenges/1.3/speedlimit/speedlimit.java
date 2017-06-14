import java.util.Scanner;

public class speedlimit
{
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int N = scan.nextInt();

      while (N != -1)
      {
         int dist = 0;
         int hours = 0;
         for (int i = 0; i < N; i++)
         {
            int speed = scan.nextInt();
            int totalSpent = scan.nextInt();
            int time = totalSpent - hours;
            hours = totalSpent;

            dist += time * speed;
         }
         System.out.println(dist + " miles");
         N = scan.nextInt();
      }
   }
}
