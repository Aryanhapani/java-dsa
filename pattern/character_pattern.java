import java.util.Scanner;

public class character_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        //row
        char ch='A';
        for(int i=1;i<=n;i++){
            //col
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println("");
        }
    }
    
}
