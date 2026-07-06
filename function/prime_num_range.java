import java.util.Scanner;

public class prime_num_range {
    
    public static Boolean isprime(int n){
        if(n==2){
            return false;
        }
        
        for(int i=2;i<n-1;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void primeinrange(int n){

        for(int i=2;i<=n;i++){
            if(isprime(i)){
                System.out.println(i+" number is prime");
            }
        }
       

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

       primeinrange(n);

        
    }
}
