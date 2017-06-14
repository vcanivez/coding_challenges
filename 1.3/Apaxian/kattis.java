import java.util.Scanner;

public class kattis {

    /** Drives execution. */
    public static void main(String[] args)  {
     
      Scanner scan = new Scanner(System.in);
      
      //String s = scan.next();
      String s = "o";
      
      String out = "";
      int len = s.length();;
    
      int i = 0;
      while (i < len - 1)
      {
         if (s.charAt(i) != s.charAt(i + 1))
         {
            out += s.charAt(i);
            i++;
         }
         else 
         {
         i++;
         }
      }
      
      out += s.charAt(len - 1);
      System.out.println(out);
     
    }
}