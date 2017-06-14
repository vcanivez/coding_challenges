import java.util.*;

public class tri
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int a = scan.nextInt();
      int b = scan.nextInt();
      int c = scan.nextInt();
      HashMap<String, String> table = new HashMap<String, String>();

      table.put(Integer.toString(b * c), a + "=" + b + "*" + c);
      table.put(Integer.toString(b + c), a + "=" + b + "+" + c);
      table.put(Integer.toString(b - c), a + "=" + b + "-" + c);
      table.put(Integer.toString(b / c), a + "=" + b + "/" + c);
      table.put(Integer.toString(a * b), a + "*" + b + "=" + c);
      table.put(Integer.toString(a + b), a + "+" + b + "=" + c);
      table.put(Integer.toString(a - b), a + "-" + b + "=" + c);
      table.put(Integer.toString(a / b), a + "/" + b + "=" + c);

      if (table.containsKey(Integer.toString(a)))
      {
         System.out.println(table.get(Integer.toString(a)));
      }
      else
      {
         System.out.println(table.get(Integer.toString(c)));
      }
   }
}
