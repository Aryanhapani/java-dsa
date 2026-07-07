public class Even {
    public static Boolean isEven(int n){
        
       return n%2==0;
    }
    public static void main(String[] args) {
        int n=40;
         

        if(isEven(n)){
            System.out.println("is Even");
        }else{
            System.out.println("is odd");
        }

    }
}
