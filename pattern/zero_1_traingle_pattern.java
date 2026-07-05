import java.util.Scanner;

public class zero_1_traingle_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=1;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                num=0;
                
            }else{
                num=1;
                
            }
            for(int j=1;j<=i;j++){
             System.out.print(num);
             num=1-num;
            
           
        }
        
        System.out.println();
    }
    }
    
}
