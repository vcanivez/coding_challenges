import java.util.Scanner;

public class bijele
{
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String out = "";
      for (int i = 0; i < 2; i++)
      {
         out += (1 - scan.nextInt()) + " ";
      }

      for (int i = 0; i < 3; i++)
      {
         out += (2 - scan.nextInt()) + " ";
      }
      out += (8 - scan.nextInt());
      System.out.println(out);
   }
}
