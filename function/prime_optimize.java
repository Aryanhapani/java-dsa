public class prime_optimize {
    public static boolean prmieornot(int n){
        if(n==2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(prmieornot(5));
    }
}
