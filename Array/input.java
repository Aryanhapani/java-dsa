import java.util.Scanner;

public class input {

    public static void main(String[] args) {
        int marks[]=new int[3];
        System.out.println("array length:-"+marks.length);

        Scanner sc=new Scanner(System.in);
        
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();

        System.out.println("1:-"+marks[0]);
        System.out.println("2:-"+marks[1]);
        System.out.println("3:-"+marks[2]);

        // marks[2]=marks[2]/10;
        // System.out.println("3:-"+marks[2]);

        int percentage=(marks[0]+marks[1]+marks[2])/3;
        System.out.println("percentage:-"+percentage);


        // for(int i=0;i<marks.length;i++){
        //     System.out.println(marks[i]);
        // }
    }
}