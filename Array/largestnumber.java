// public class largestnumber {
//  public static void main(String[] args) {
//     int num[]={1,2,6,3,5};
//     int max=num[0];

//     for(int i=0;i<num.length;i++){
//         if(max < num[i]){
//              max=num[i];
//         }
//     }
//     System.out.println(max);
//  }   
// }
import java.util.*;
public class largestnumber {
    public static int large_and_small(int num[]){
        int larger=Integer.MIN_VALUE;
        int smaller=Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            if(larger < num[i]){
                larger=num[i];
            }

            if(smaller > num[i]){
                smaller=num[i];
            }
        }
        System.out.println("smaller number:-"+smaller);

        return larger;
    }

    public static void main(String[] args) {
        int num[]={1,2,6,3,5};
        System.out.println("larger number:-"+large_and_small(num));
    }
}
