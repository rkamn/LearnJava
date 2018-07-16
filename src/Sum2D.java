/**
 * Write a function called sum2D that returns the sum of all diagonals in a 2-dimensional array.
 */

import java.util.Scanner;

public class Sum2D {

    public static void main(String[] args){

        int i, j, m, n, k, a[][] = new int[10][10];

        Scanner s = new Scanner(System.in);

        System.out.println("Enter Dimensions of matrix: \n m: ");
        m = s.nextInt();
        System.out.println("n: ");
        n = s.nextInt();

        System.out.println("Enter elements: ");

        for (i=0;i<m;i++) {
            for (j=0;j<n;j++) {
                a[i][j] = s.nextInt();
            }
        }

        k = sum2D(a, m, n);

        System.out.println("Sum of Diagonals is: "+k);


    }

    private static int sum2D(int a[][], int m, int n){
        int i, j, sum;

        sum = 0;

        for(i=0;i<m;i++){
            for(j=0;j<n;j++){

                if(i==j)
                    sum = sum + a[i][j];
                if((i+j)== (n-1))
                    sum = sum + a[i][j];
            }
        }

        return sum;
    }

}
