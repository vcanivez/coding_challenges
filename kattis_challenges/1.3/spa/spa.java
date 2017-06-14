import java.util.Scanner;

public class spa
{
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int H = scan.nextInt();
      int m = scan.nextInt();

      int timeInMin = ((H + 24) * 60 + m - 45);
      int outHour = (timeInMin / 60) % 24;
      int outMin = timeInMin % 60;

      System.out.println(outHour + " " + outMin);
   }
}
