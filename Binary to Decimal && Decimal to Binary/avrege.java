public class avrege {
    public static float avg(float a,float b,float c){
       float avg=(a+b+c)/3;
       System.out.println("your avreage is:-"+avg);
       return 0;
    }
    public static void main(String[] args) {
        float a=5;
        float b=10;
        float c=15;
         avg(a, b, c);
    }
}
