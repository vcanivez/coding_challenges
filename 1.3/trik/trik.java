import java.util.Scanner;

public class trik
{
   int pos;
   trik()
   {
      pos = 1;
   }

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      trik tr = new trik();

      String s = scan.next();
      int size = s.length();

      for (int i = 0; i < size; i++)
      {
         tr.toggle(s.charAt(i));
      }
      System.out.println(tr.pos);
   }
   void toggle(char letter)
   {
      switch (letter)
      {
         case 'A':
            if(pos == 1)
            {
               pos = 2;
            }
            else if (pos == 2)
            {
               pos = 1;
            }
            break;
         case 'B':
            if(pos == 2 )
            {
               pos = 3;
            }
            else if (pos == 3)
            {
               pos = 2;
            }
            break;
         case 'C':
            if(pos == 3 )
            {
               pos = 1;
            }
            else if (pos == 1)
            {
               pos = 3;
            }
            break;
      }
   }
}
