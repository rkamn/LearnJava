/**
 * Write a function negSum to return sum of all negative numbers in an array.
 */

import java.util.Scanner;

public class Array01 {
    public static void main(String[] args){

        int i,j,a[] = new int[5];
        Scanner s = new Scanner(System.in);

        System.out.println("Enter values: ");

        for(i=0;i<5;i++){
            a[i] = s.nextInt();
        }

        j = negSum(a);

        System.out.println("Sum of negative numbers is: "+j);
    }

    public static int negSum(int a[]){

        int i, sum;

        sum = 0;

        for(i=0;i<5;i++){
            if(a[i]<0)
                sum = sum + a[i];
        }

        return sum;
    }
}
