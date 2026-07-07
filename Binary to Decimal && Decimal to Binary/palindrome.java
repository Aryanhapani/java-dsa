public class palindrome {
    public static void main(String[] args) {
        int n=121;
        int orginal=n;
        int rev=0;

        while (n > 0) {
            int ld=n%10;
            rev=rev*10+ld;
            n=n/10;
            
        }
        if(rev == orginal){
            System.out.println("your number is palindrome");
        }else{
            System.out.println("your number is not palindrome");
        }
    }
}
