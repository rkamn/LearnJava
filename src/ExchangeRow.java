/**
 *       Exchange First row with last row
 *       1 2  3  4                                           4 2  3  1
 *       5 6  7  8                                           8 6  7  5
 *       9 10 11 12                                         12 10 11 9
 */

import java.util.Scanner;

public class ExchangeRow {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        int i, j, m, n, a[][] = new int[10][10];

        System.out.println("Enter values of m&n: ");
        m = s.nextInt();
        n = s.nextInt();

        System.out.println("Enter values: ");

        for (i=0;i<m;i++) {
            for (j=0;j<n;j++) {
                a[i][j] = s.nextInt();
            }
        }

        System.out.println("Entered numbers are: ");

        for (i=0;i<m;i++) {
            for (j=0;j<n;j++) {
                System.out.print(a[i][j]);
            }
            System.out.print("\n");
        }

        swap(a, m, n);

        System.out.println("Rows after swap are: ");

        for (i=0;i<m;i++) {
            for (j=0;j<n;j++) {
                System.out.print(a[i][j]);
            }
            System.out.print("\n");
        }
    }

    private static void swap(int a[][], int m, int n){

        int i, temp;

        for (i=0;i<m;i++) {
            temp = a[i][0];
            a[i][0] = a[i][n-1];
            a[i][n-1] = temp;
        }
    }
}
