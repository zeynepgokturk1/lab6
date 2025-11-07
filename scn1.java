public class scn1 {
    public static void main(String[] args){
        int[] stnumbers= new int[20];
        for (int i =0;i<stnumbers.length;i++) {
            stnumbers[i] = 1000+i;

        }

        int[] larger=new int[42];
        for(int i =0;i<stnumbers.length;i++){
            larger[i]=stnumbers[i];
        }
        System.out.println("stnumbers:");
        for (int i = 0; i < stnumbers.length; i++) {
            System.out.print(stnumbers[i] + " ");
        }

        System.out.println("\nlarger:");
        for (int i = 0; i < larger.length; i++) {
            System.out.print(larger[i] + " ");
        }


    }
}
