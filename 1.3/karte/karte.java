import java.util.Scanner;
import java.util.ArrayList;

public class karte
{
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String N = scan.next();
      int size = N.length();
      String card = "";

      ArrayList<String> P = new ArrayList<String>();
      ArrayList<String> K = new ArrayList<String>();
      ArrayList<String> H = new ArrayList<String>();
      ArrayList<String> T = new ArrayList<String>();

      int i = 0;
      while (i < size)
      {
         char suit = N.charAt(i);

         switch (suit)
         {
            case 'P':
               card = N.substring(i, i + 3);
               if (P.contains(card))
               {
                  System.out.println("GRESKA");
                  System.exit(0);
               }
               P.add(card);
               i += 3;
               break;
            case 'K':
               card = N.substring(i, i + 3);
               if (K.contains(card))
               {
                  System.out.println("GRESKA");
                  System.exit(0);
               }
               K.add(card);
               i += 3;
               break;
            case 'H':
               card = N.substring(i, i + 3);
               if (H.contains(card))
               {
                  System.out.println("GRESKA");
                  System.exit(0);
               }
               H.add(card);
               i += 3;
               break;
            case 'T':
               card = N.substring(i, i + 3);
               if (T.contains(card))
               {
                  System.out.println("GRESKA");
                  System.exit(0);
               }
               T.add(card);
               i += 3;
               break;
         }
      }
      int missingP = 13 - P.size();
      int missingK = 13 - K.size();
      int missingH = 13 - H.size();
      int missingT = 13 - T.size();
      System.out.println(missingP + " " + missingK + " " + missingH + " " + missingT);
   }
}
