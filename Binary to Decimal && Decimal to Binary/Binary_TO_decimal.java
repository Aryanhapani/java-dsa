import java.lang.Math;
public class Binary_TO_decimal {
    public static void bintodec(int n){
         int power=0;
        int decimal=0;
        while (n > 0) {
            int lastdigit=n%10;
            decimal=decimal + lastdigit *(  Math.powExact(2, power) );
            power++;
            n=n/10;
        }
        System.out.println(decimal);
    }

    public static void main(String[] args) {
        int n=1000;
        bintodec(n);
       
    }
}