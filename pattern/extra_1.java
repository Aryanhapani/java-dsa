

public class extra_1
{
	public static void main(String[] args) {
	int n=4;
	
	for(int i=1;i<=n;i++){
	    for(int j=1;j<=2*i-1;j++){
	       //System.out.print("*");
	       //if(j%2==0){
	       //    System.out.print("*");
	       //}else{
	       //    System.out.print(i+"");
	       //}
	       System.out.print(j%2==0?"*":i);
	    }
	    System.out.println();
	}
	
	for(int i=n;i>=1;i--){
	    for(int j=1;j<=2*i-1;j++){
	       //System.out.print("*");
	       //if(j%2==0){
	       //    System.out.print("*");
	       //}else{
	       //    System.out.print(i+"");
	       //}
	        System.out.print(j%2==0?"*":i);
	    }
	    System.out.println();
	}
	}
}