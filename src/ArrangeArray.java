import java.util.Arrays;

public class ArrangeArray {

    public static void main(String[] args){

        int i,n, temp , a[] = new int[]{12, -9, 3, -18, 15, 6};
        n =  0;
        System.out.println(Arrays.toString(a));

        for(i=0; i<6; i++)
        {
            if(a[i]<0)
            {
              temp = a[n];
              a[n] = a[i];
              n++;
              shift(n, i, temp, a);
            }
        }


        System.out.println(Arrays.toString(a));
    }

    private static void shift( int n, int i, int b, int a[]){

        int j;

        for(j=i;j>=n;j--)
        {
            a[j] = a[j-1];

        }
        a[j] = b;

    }
}
