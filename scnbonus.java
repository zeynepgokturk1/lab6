import java.util.Random;

public class scnbonus {
    public static void main(String[] args) {
        Random random = new Random();
        int students = 5;
        int quiz = 4;
        int[][] scors = new int[students][quiz];
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < quiz; j++) {
                scors[i][j] = random.nextInt(101);
            }
        }
        System.out.print("student/quiz");
        for (int j = 0; j < quiz; j++) {
            System.out.print(" " + (j + 1));
        }
        System.out.println(" ");
        for (int i = 0; i < students; i++) {
            System.out.print("student " + (i + 1));
            for (int j = 0; j < quiz; j++) {
                System.out.print( " "+scors[i][j]+" ");
            }
            System.out.println(" ");
        }
        double[] rowavarages= new double[students];
        System.out.println("\nstudents avarage");
        for(int i =0;i<students;i++){
            int avarage=0;
            for (int j=0;j<quiz;j++){
                avarage+=scors[i][j];
            }
            rowavarages[i]=(double)avarage/quiz;
            System.out.println("student "+ (i+1)+": "+rowavarages[i]);

        }
        double[] columnavarage=new double[quiz];
        System.out.println("\nquizess avarage");
        for(int j=0;j<quiz;j++){
            int sum=0;
            for(int i =0;i<students;i++){
                sum+=scors[i][j];
            }
            columnavarage[j]=(double) sum/students;
            System.out.println("quız "+ (j+1)+": "+columnavarage[j]);
        }
        int maxScore = -1;
        int maxStudent = -1;
        int maxQuiz = -1;

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < quiz; j++) {
                if (scors[i][j] > maxScore) {
                    maxScore = scors[i][j];
                    maxStudent = i;
                    maxQuiz = j;
                } else if (scors[i][j] == maxScore) {
                    if (i < maxStudent) {
                        maxStudent = i;
                        maxQuiz = j;
                    } else if (i == maxStudent && j < maxQuiz) {
                        maxQuiz = j;
                    }
                }
            }
        }
        System.out.println("max score : "+maxScore+" position "+(maxStudent+1)+","+(maxQuiz+1));
    }
}
