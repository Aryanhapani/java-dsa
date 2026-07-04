public class Binomial_coefficent {
    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }

    public static int Bin_coff(int n,int r){
        int n_fact=factorial(n);
        int r_fact=factorial(r);
        int nr_fact=factorial(n-r);
        int ncr=n_fact/(r_fact*nr_fact);
        return ncr;

    }
    public static void main(String[] args) {
        int n=5;
        int r=2;
        int ncr=Bin_coff(n, r);
        System.out.println("your BinomialCoefficent:-"+ncr);
    }
}
