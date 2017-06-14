import java.util.*;

public  class easiest
{
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String N = scan.next();

      while (!N.equals("0"))
      {
         int digitSum = 0;
         int size = N.length();
         for (int i = 0; i < size; i++)
         {
            digitSum += Character.getNumericValue(N.charAt(i));
         }
         System.out.println(digitSum);
         int i = 2;
         int p = 0;
         while (p != digitSum)
         {
            int Xi = Integer.parseInt(N) * i;
            String x = Integer.toString(Xi);
            i++;
            int xSize = x.length();
            for (int j = 0; j < xSize; j++)
            {
               p += Character.getNumericValue(x.charAt(j));
               if (p == digitSum)
               {
                  break;
               }
            }


            System.out.println(p);
         }
         N = scan.next();
      }
   }
}
