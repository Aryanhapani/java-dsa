import java.util.Scanner;

public class productof_a_and_b {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:-");
        int a=sc.nextInt();
        System.out.println("Enter b:-");
        int b=sc.nextInt();
        
        int product=a*b;

        System.out.println("product of a and b:-"+product);

    }
}