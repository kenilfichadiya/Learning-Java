public class Loops {
    public static void main(String[] args){
        // for(int i=0;i<10;i++){
        //     // System.out.println();
        //     System.out.println(i);
        // }
        int j = 10;

        // while(j>0){
        //     System.out.println(j);
        //     j--;
        // }
        // do{
        //     System.out.println(j);
        //     j--;
        // }while(j>0);

        for(int i = 0; i<10; i++){
            System.out.println(i);
            if(i == 5){
                continue;
            }
        }
    }    
}
