public class Decimal_TO_binary {
    public static void main(String[] args) {
        int n=11;
        int power=0;
        int bin=0;

        while (n > 0) {
            int remider=n%2;
            bin=bin+(remider * Math.powExact(10, power));
            power++;
            n=n/2;
        }
        System.out.println("your binary:-"+bin);
    }
}
