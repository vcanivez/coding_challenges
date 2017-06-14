import java.util.Scanner;

public class pot
{
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int N = scan.nextInt();
      int X = 0;
      for (int i = 0; i < N; i++)
      {
         String current = scan.next();

         int power = Character.getNumericValue(current.charAt(current.length() - 1));
         int p = Integer.valueOf(current.substring(0, current.length() - 1));
         // System.out.println(p);
         // System.out.println(power);
         X += Math.pow(p, power);
      }
      System.out.println(X);
   }
}
