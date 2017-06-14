import java.util.*;

public class bela
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int N = scan.nextInt() * 4;
      String Bs = scan.next();
      char B = Bs.charAt(0);

      HashMap<String, int[]> table = new HashMap<String, int[]>();

      table.put("A", new int[]{11, 11});
      table.put("K", new int[]{4, 4});
      table.put("Q", new int[]{3, 3});
      table.put("J", new int[]{20, 2});
      table.put("T", new int[]{10, 10});
      table.put("9", new int[]{14, 0});
      table.put("8", new int[]{0, 0});
      table.put("7", new int[]{0, 0});

      int score = 0;
      for (int i = 0; i < N; i++)
      {
         String card = scan.next();
         int[] temp = new int[2];
         temp = table.get(Character.toString(card.charAt(0)));
         int index = 0;
         index = (card.charAt(1) == B) ? 0 : 1;

         score += temp[index];
      }
      System.out.println(score);
   }
}
