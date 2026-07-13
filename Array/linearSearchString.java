public class linearSearchString {
    public static int found(String items[],String key){
        for(int i=0;i<items.length;i++){
            if(items[i] == key){
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        String items[]={"apple","banana","mangoes","kiwi"};
        String key="mangoes";

        int index=found(items, key);

        if(index == -1){
            System.out.println("String is not found");
        }else{
            System.out.println("String is found at index:-"+index);
        }
    }
    
}
