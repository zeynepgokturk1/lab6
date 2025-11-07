import java.util.Random;

public class scn4 {
    public  static void main(String[] args){
        Random random= new Random();
        int[] arrys= new int[30];
        for (int i =0;i<arrys.length;i++){
            arrys[i]=random.nextInt(101);
        }
        for(int i =0;i<arrys.length;i++){
            if(i==0) {
                System.out.print(arrys[i]+" ");
            }
            else if (i==(arrys.length-1)){
                System.out.println(arrys[i]+" ");
            }
            else{
                if(arrys[i]>arrys[i+1]&& arrys[i]>arrys[i-1]){
                    System.out.print("peak ");
                }
                else{
                    System.out.print(arrys[i]+" ");
                }
            }
        }
    }
}
