public class Swap {
    public static void main(String[] args){
        int a,b;
        a=10;
        b=20;
        System.out.println("A="+a);
        System.out.println("B="+b);

        a = -1*(-a-b);
        b = a-b;
        a = a-b;

        System.out.println("A="+a);
        System.out.println("B="+b);
    }
}
