import java.util.Scanner;
import java.util.ArrayDeque;
import java.math.BigInteger;

public class threepowers
{
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      String nString = scan.next();

      while (!nString.equals("0"))
      {
         String subset = "{";
         ArrayDeque<BigInteger> queue = new ArrayDeque<BigInteger>() ;
         if ( nString.equals("1"))
         {
            subset += " }";
         }
         else
         {
            BigInteger n = new BigInteger(nString);
            BigInteger minusOne = new BigInteger("1");
            n = n.subtract(minusOne);
            String nBinary = n.toString(2);
            //Long n = Long.parseLong(nString) - 1;
            //String nBinary = Long.toBinaryString(n);
            //System.out.println(n);
            //System.out.println(nBinary);
            int size = nBinary.length();
            for (int i = 0; i < size; i++)
            {
               int power = size - 1 - i;
               String c = "" + nBinary.charAt(i);
               int elemBin = Integer.parseInt(c);

               BigInteger elemThreePow = new BigInteger("3");
               elemThreePow = elemThreePow.pow(power);

               if (elemBin != 0)
               {
                  queue.push(elemThreePow);
               }
            }
            int queueSize = queue.size();
            for (int i = 0; i < queueSize - 1; i++)
            {
               subset += " " + queue.pop() +",";
            }
            subset += " " + queue.pop() + " }";
         }

         System.out.println(subset);
         nString = scan.next();
      }
   }
}
