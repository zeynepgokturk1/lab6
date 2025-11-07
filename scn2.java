import java.util.Random;

public class scn2 {
    public static void main(String[] args){
        Random randomgenerate= new Random();
        int size = randomgenerate.nextInt(11)+10;
        int[] rotate=new int[size];

        for(int i=0;i<rotate.length;i++){
            rotate[i]=randomgenerate.nextInt(100);
        }
        int[] newrotate=new int[size];
        for(int i =0;i<size;i++){
            if(i==0) {
                newrotate[0]=rotate[size-1];
            }
            else {
                newrotate[i]=rotate[i-1];
            }
        }
        System.out.println("old list");
        for (int i =0;i<size;i++){
            System.out.print(rotate[i] +" ");
        }
        System.out.println("\nnew list");
        for (int i =0;i<size;i++){
            System.out.print(newrotate[i] +" ");
        }


    }
}
