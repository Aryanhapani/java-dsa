public class sum_of_digit {

    public static void main(String[] args) {
        int n=12345;
        int sum=0;
        while (n > 0) {
           n=n/10;
           sum++; 
        }
        System.out.println("your sum is:-"+sum);
    }
}