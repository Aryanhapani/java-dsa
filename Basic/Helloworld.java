import java.util.Scanner;

public class Helloworld {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            //number
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }

            //space
            for(int j=0;j<2*i;j++){
                System.out.print(" ");
            }

            //number
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        
        int space=2*n-2;
        for(int i=1;i<=n;i++){

            //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            //space
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }

            //star
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println("");
            space=space-2;
        }
    }
}