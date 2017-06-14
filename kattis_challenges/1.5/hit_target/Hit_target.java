import java.util.Scanner;

public class Hit_target
{
   public static void main(String[] args) {

      int xIn, yIn, rIn, x1In, x2In, y1In, y2In;

      //File file = new File("iotest.txt");
      //Scanner scan = new Scanner(file);

      Scanner scan = new Scanner(System.in);
      int nTarget = scan.nextInt();

      Shape[] targets = new Shape[nTarget];

      int i = 0;
      while (i < nTarget)
      {
         String shape = scan.next();
         if (shape.equals("circle"))
         {
            xIn = scan.nextInt();
            yIn = scan.nextInt();
            rIn = scan.nextInt();
            targets[i] = new Circle(xIn, yIn, rIn);
            i++;
         }
         else if (shape.equals("rectangle"))
         {
            x1In = scan.nextInt();
            y1In = scan.nextInt();
            x2In = scan.nextInt();
            y2In = scan.nextInt();
            targets[i] = new Rectangle(x1In, y1In, x2In, y2In);
            i++;
         }
      }

      int nShots = scan.nextInt();
      Shot[] shots = new Shot[nShots];
      i = 0;
      while (i < nShots)
      {
         int xShot = scan.nextInt();
         int yShot = scan.nextInt();
         shots[i] = new Shot(xShot, yShot);
         i++;
      }
      for (i = 0; i < nShots; i++)
      {
         int hit = 0;
         int xShot = shots[i].getX();
         int yShot = shots[i].getY();
         for (int j = 0; j < nTarget; j++)
         {
            if (targets[j] instanceof Circle)
            {
               if (((Circle)targets[j]).isTouched(xShot, yShot))
               {
                  hit++;
               }
            }
            else if (targets[j] instanceof Rectangle)
            {
               if (((Rectangle)targets[j]).isTouched(xShot, yShot))
               {
                  hit++;
               }
            }
         }
         System.out.println(hit);
      }
   }
}

class Shot
{
   private int x, y;
   Shot(int xIn, int yIn)
   {
      x = xIn;
      y = yIn;
   }

   public int getX()
   {
      return x;
   }

   public int getY()
   {
      return y;
   }
}

class Shape
{

}

class Circle extends Shape
{

   private int x, y, r;
   Circle(int xIn, int yIn, int rIn)
   {
      x = xIn;
      y = yIn;
      r = rIn;
   }

   public boolean isTouched(int xIn, int yIn)
   {
      if (this.isInXrange(xIn, yIn) && this.isInYrange(xIn, yIn))
      {
         return true;
      }
      return false;
   }

   public boolean isInXrange(int xIn, int yIn)
   {
      int top = y - r;
      int bottom = y + r;
      if (y < top || y > bottom)
      {
         return false;
      }
      else
      {
         int yVal = Math.abs(y - yIn);
         double xVal = Math.sqrt(Math.pow(r, 2) - Math.pow(yVal,2));
         double leftBound = (double) x - xVal;
         double rightBound = (double) x + xVal;

         if (xIn >= leftBound && xIn <= rightBound )
         {
            return true;
         }
      }
      return false;
   }

   public boolean isInYrange(int xIn, int yIn)
   {
      int left = x - r;
      int right = x + r;
      if (x > right || x < left)
      {
         return false;
      }
      else
      {
         int xVal = Math.abs(x - xIn);
         double yVal = Math.sqrt(Math.pow(r, 2) - Math.pow(xVal,2));
         double topBound = (double) y - yVal;
         double bottomBound = (double) y + yVal;

         if (yIn >= topBound && yIn <= bottomBound )
         {
            return true;
         }
      }
      return false;
   }
}

class Rectangle  extends Shape
{
   private int x1, x2, y1, y2;

   Rectangle(int x1in, int y1in, int x2in, int y2in)
   {
      x1 = x1in;
      y1 = y1in;
      x2 = x2in;
      y2 = y2in;
   }

   public boolean isTouched(int x, int y)
   {
      if (x >= x1 && x <= x2 && y >= y1 && y <= y2)
      {
         return true;
      }

      return false;
   }
}
