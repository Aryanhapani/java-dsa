public class pairs_array {
    public static void check(int arr[]){
        int tp=0;

        for(int i=0;i<arr.length;i++){
            int current=arr[i];//2,3,4,5,.....

            for(int j=i+1;j<arr.length;j++){
                System.out.print("(" +current+","+arr[j]+")");//(2,3)(2,4)(2,5)
                tp++;
            }
            System.out.println();
        }
        System.out.println("total number of pairs:-"+tp);

    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        check(arr);


    }
}
