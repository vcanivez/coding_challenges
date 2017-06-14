import java.util.Scanner;

public class zamka
{
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int L = scan.nextInt();
      int D = scan.nextInt();
      int X = scan.nextInt();

      for (int i = L; i <= D; i++)
      {
         int Nval = 0;
         String Ns = Integer.toString(i);
         for (int j = 0; j < Ns.length(); j++)
         {
            Nval += Character.getNumericValue(Ns.charAt(j));
         }
         if (Nval == X)
         {
            System.out.println(i);
            break;
         }
      }
      // check all values from
      for (int i = D; i >= L; i--)
      {
         int Nval = 0;
         String Ns = Integer.toString(i);
         for (int j = 0; j < Ns.length(); j++)
         {
            Nval += Character.getNumericValue(Ns.charAt(j));
         }
         if (Nval == X)
         {
            System.out.println(i);
            break;
         }
      }
   }
}
