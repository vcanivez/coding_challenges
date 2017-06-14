import java.util.Scanner;
import java.util.ArrayList;

public class kemija
{
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String N = scan.nextLine();
      int size = N.length();

      ArrayList<Character> list = new ArrayList<Character>();
      list.add('a');
      list.add('e');
      list.add('i');
      list.add('o');
      list.add('u');

      int i = 0;
      while (i < size)
      {
         if (list.contains(N.charAt(i)))
         {
            String prefix = N.substring(0, i + 1);
            String suffix = N.substring(i + 3);
            N = prefix + suffix;
            size = N.length();
            i++;
         }
         else
         {
            i++;
         }
      }
      System.out.println(N);
   }
}
