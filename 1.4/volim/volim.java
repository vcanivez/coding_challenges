import java.util.*;

public class volim
{
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int player = scan.nextInt();
      int numberQuestion = scan.nextInt();

      int timeSpent = 0;
      for (int i = 0; i < numberQuestion; i++)
      {
         timeSpent += scan.nextInt();
         String ansType = scan.next();
         if (timeSpent >= 210)
         {
            break;
         }
         if (ansType.equals("T"))
         {
            player++;
         }
      }
      System.out.println(player  % 8);
   }
}
