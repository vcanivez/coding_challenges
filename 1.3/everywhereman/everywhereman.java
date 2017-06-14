import java.util.Scanner;
import java.util.ArrayList;

public class everywhereman
{
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int nTest = scan.nextInt();
      ArrayList<String> list = new ArrayList<String>();
      for (int j = 0; j < nTest; j++)
      {
         int N = scan.nextInt();
         list.clear();
         for (int i = 0; i < N; i++)
         {
            String city = scan.next();
            if (!list.contains(city))
            {
               list.add(city);
            }
         }
         System.out.println(list.size());
      }
   }
}
