import java.util.*;

public class skijump
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int N = scan.nextInt();
      int j = scan.nextInt();
      int p = scan.nextInt();
      int H = scan.nextInt();
      int L = scan.nextInt();

      // calculate v0

      double G = 9.81;
      double Epot = j * G;
      double Vo = Math.sqrt(2 * Epot);
      double Lsq = Math.pow(L, 2);
      double Vsq = Math.pow(Vo, 2);
      double Hsq = Math.pow(H, 2);



      double interOne =  (4 * H * L * Vsq - Math.sqrt(2) * Math.sqrt(-Lsq * Vsq * (G * H * Lsq - G * Lsq * p - 4 * Hsq * Vsq - 4 * H * p * Vsq)))/(G * Lsq + 4 * H * Vsq);
      double hl = H * (1 - 2 * Math.pow((interOne/L),2));
      double hlbis = 2 * H * Math.pow(((interOne/L) - 1),2);
      double fl = -(G/2)*Math.pow((interOne/Vo),2) + H + p;
      System.out.println(Vo);
      System.out.println(interOne);
      System.out.println(hl);
      System.out.println(fl);
   }
}
