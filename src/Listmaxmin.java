/**
 * Find maximum and minimum from a list.
 */

public class Listmaxmin {

    public static void main(String[] args) {

        int i, max, min, a[] = new int[]{3,5,7,9,1,2,4,6,0,8};

        max = a[0];
        min = a[0];

        for(i=0;i<10;i++)
        {
            if(max<a[i])
                max = a[i];

            if(min>a[i])
                min = a[i];
        }

        System.out.println("Max: "+max);
        System.out.println("Min: "+min);

    }
}
