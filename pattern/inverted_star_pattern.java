import java.util.Scanner;

public class inverted_star_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //row
        for(int i=1;i<=n;i++){
            //col
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
