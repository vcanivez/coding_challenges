import java.util.Scanner;

public class reversebin
{
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int N = scan.nextInt();
      String Ns = Integer.toBinaryString(N);
      int size = Ns.length();
      String reversedBin = "";
      for (int i = size - 1; i >= 0; i--)
      {
         reversedBin += Ns.charAt(i);
      }
      Integer i = Integer.parseInt(reversedBin,2);
      System.out.println(i);
   }
}
