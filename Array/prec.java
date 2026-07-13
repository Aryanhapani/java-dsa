public class prec {

    public static void main(String[] args) {
        int arr[]={2,4,6,8,1,12,14,1};
        int max=arr[0];
        int sec=arr[0];
        

        for(int i=0;i<arr.length;i++){
            if(max < arr[i]){
                max=arr[i];
            }}
        System.out.println(max);

        for(int i=0;i<arr.length;i++){
           if(max != arr[i] && sec < arr[i] ){
            sec=arr[i];
        }
    }
    System.out.println(sec);

      
        
    }
}
