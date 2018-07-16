/**
 * Write a function called range that returns the difference between the largest and
 * smallest elements in an array.
 */

import java.util.Scanner;

public class ArrayRange {

    public static void main(String[] args){
        int i, n, r, a[] = new int[10];

        Scanner s = new Scanner(System.in);

        System.out.println("How many numbers you want to enter: ");
        n = s.nextInt();

        System.out.println("Enter numbers: ");

        for(i=0;i<n;i++){
            a[i] = s.nextInt();
        }

        r = range(a,n);

        System.out.println("The range of array is: "+r);
    }

    private static int range(int a[], int n){
        int i, max, min;

        max = min = a[0];

        for(i=0;i<n;i++){
            if(max<a[i])
                max = a[i];
            if(min>a[i])
                min = a[i];
        }

        return (max - min);
    }
}
