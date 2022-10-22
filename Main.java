import java.util.*;

import static java.util.Arrays.stream;

public class Main {
    public static void main(String[] args) {
        // Co-ordinate geometry

        // Distance between 2 points

        int A[] = {1,2} ;
        int B[] = {2,3} ;

        int Ax,Ay;

        Ax = A[0] ;
        Ay = A[1] ;

        int Bx, By ;
        Bx = B[0] ;
        By = B[1] ;

        System.out.println("A(X,Y): " + "A("+Ax+","+Ay+")");
        System.out.println("B(X,Y): " + "B("+Bx+","+By+")");

        // calculate the distance b/w Point A and Point B

        int x = Ax - Bx ;
        int y = Ay - By ;

        double AB = Math.sqrt(Math.pow(x,2) + Math.pow(y,2) ) ;
        System.out.println("Distance between Point A and B is: "+AB);
    }


}

/*

 */