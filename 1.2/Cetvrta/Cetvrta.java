import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Cetvrta
{
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      int xOut;
      int yOut;

      int x1 = scan.nextInt();
      int y1 = scan.nextInt();
      int[] A = {x1, y1};
      int x2 = scan.nextInt();
      int y2 = scan.nextInt();
      int[] B = {x2, y2};
      int x3 = scan.nextInt();
      int y3 = scan.nextInt();
      int[] C = {x3, y3};

      int[] pivot = new int[2];
      int[] pt1 = new int[2];
      int[] pt2 = new int[2];

      if (Distance.dist(A, B) < Distance.dist(A, C))
      {
         if (Distance.dist(C, B) < Distance.dist(A, C))
         {
            pivot = B;
            pt1 = A;
            pt2 = C;
         }
         else
         {
            pivot = A;
            pt1 = B;
            pt2 = C;
         }
      }
      else if (Distance.dist(C, B) < Distance.dist(A, B))
      {
         pivot = C;
         pt1 = A;
         pt2 = B;
      }
      else{
         pivot = A;
         pt1 = B;
         pt2 = C;
      }

      // System.out.println(pivot[0] + " " + pivot[1]);
      // System.out.println(pt1[0] + " " + pt1[1]);
      // System.out.println(pt2[0] + " " + pt2[1]);

      int xCoor = pivot[0] + pt1[0] - pivot[0] + pt2[0] - pivot[0];
      int yCoor = pivot[1] + pt1[1] - pivot[1] + pt2[1] - pivot[1];

      System.out.println(xCoor + " " + yCoor);
   }
}

class Distance
{
   public static double dist(int[] pointA, int[] pointB)
   {
      int x1 = pointA[0];
      int x2 = pointB[0];
      int y1 = pointA[1];
      int y2 = pointB[1];

      double xdist = Math.abs(x1 - x2);
      double ydist = Math.abs(y1 - y2);

      return Math.sqrt(Math.pow(xdist, 2) + Math.pow(ydist, 2)) ;
   }
}
