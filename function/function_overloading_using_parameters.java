public class function_overloading_using_parameters {
    public static int sum(int a,int b){
        return a+b;
    }

    public static int sum(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        int a=5;
        int b=10;
        int c=15;
        System.out.println("two parameters:-"+sum(a, b));
        System.out.println("three parameters:-"+sum(a, b, c));
    }
}