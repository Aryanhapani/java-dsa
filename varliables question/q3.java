
import java.util.Scanner;

public class q3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       
        float pencil=sc.nextFloat();
        float pen=sc.nextFloat();
        float eraser=sc.nextFloat();

        float total=(pencil+pen+eraser);

        System.out.println("your total is "+total);

        //new total

        float newtotal=total + (0.18f + total);
        System.out.println("with 18 % gst "+newtotal);
    }
}