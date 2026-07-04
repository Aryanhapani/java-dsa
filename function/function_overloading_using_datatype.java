public class function_overloading_using_datatype {
    public static int sum(int a,int b){
        return a+b;
    }

    public static float sum(float a,float b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println("int:-"+sum(5, 5));
        System.out.println("float:-"+sum(3.2f,24.45f ));
    }
}
