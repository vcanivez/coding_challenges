import java.util.Scanner;

public class ladder
{
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int height = scan.nextInt();
      int angle = scan.nextInt();

      double out = (double) height / (Math.sin(Math.toRadians(angle)));

      int out2 = (int) Math.ceil(out);
      System.out.println(out2);
   }
}
