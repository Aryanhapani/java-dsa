public class prime2 {
    public static boolean primeornot(int n){
       
        if(n==2){
            return false;
        }
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(primeornot(6));
    }
}
