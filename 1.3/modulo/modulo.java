import java.util.Scanner;
import java.util.ArrayList;

public class modulo
{
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int out = 0;
      ArrayList<Integer> arr = new ArrayList<Integer>();

      for (int i = 0; i < 10; i++)
      {
         arr.add(scan.nextInt() % 42);
      }
      ArrayList<Integer> arr2 = new ArrayList<Integer>();
      for (int i = 0; i < 10; i++)
      {
         if (!arr2.contains(arr.get(i)))
         {
            arr2.add(arr.get(i));
         }
      }

      System.out.println(arr2.size());
   }
}
