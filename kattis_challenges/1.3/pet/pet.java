import java.util.Scanner;

public class pet
{
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int highScore = 0;
      int winner = 0;
      int i = 0;
      while (i < 5)
      {
         int score = 0;
         int j = 0;
         while (j < 4)
         {
            score += scan.nextInt();
            j++;
         }
         if (score > highScore)
         {
            i++;
            highScore = score;
            winner = i;
         }
         else
         {
            i++;
         }
      }
      System.out.println(winner + " " + highScore);
   }
}
