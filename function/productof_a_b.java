public class productof_a_b {
    public static int product(int a,int b){
        int multi=a*b;
        return multi;
    }

    public static void main(String[] args) {
        int a=10;
        int b=20;
        int multiplay=product(a, b);
        System.out.println("your multiplication:-"+multiplay);
    }
}