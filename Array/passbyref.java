public class passbyref {
    public static void update(int marks[],int nonchange){
        nonchange=10;
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }

    public static void main(String[] args) {
        int marks[]={50,51,52};
        int nonchange=5;
        update(marks,nonchange);
        System.out.println(nonchange);
        
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }

    }
}
