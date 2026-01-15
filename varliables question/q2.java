// In a program, input the side of a square. You have to output the area of the
// square.
// (Hint : area of a square is (side x side))

import java.util.Scanner;

public class q2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float side=sc.nextFloat();

        float area=side*side;

        System.out.println(" area of a square is "+area);
    }
}
 