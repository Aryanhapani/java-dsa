import java.util.Scanner;

public class Floyed_triangle_patterns {

      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=1;
        //row
        for(int i=1;i<=n;i++){
            //col
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
      }
}
