/**
 * Print even numbers between two numbers.
 */

import java.util.Scanner;

public class Between {

    public static void main(String[] args){
        int x,y,i;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter X:");
        x = s.nextInt();

        System.out.println("Enter Y:");
        y = s.nextInt();

        System.out.println("Even nos between X & Y are:");

        for(i=x;i<=y;i++) {

            if(i%2==0)
                System.out.println(i);
        }

    }
}
