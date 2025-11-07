import java.util.Random;

public class scn3 {
    public static void main(String[] args) {
        Random randomgen = new Random();
        String[] weathers={"sunny","sunny","sunny","sunny","cloudy","cloudy","cloudy","rainy","rainy","stormy"};
        int sunny=0;
        int cloudy=0;
        int rainy=0;
        int stormy=0;

        for(int i=0;i<1000000;i++) {
            int rnd = randomgen.nextInt(weathers.length);
            switch (weathers[rnd]) {
                case "sunny":
                    sunny += 1;
                    break;
                case "cloudy":
                    cloudy += 1;
                    break;
                case "rainy":
                    rainy += 1;
                    break;
                case "stormy":
                    stormy += 1;
            }
        }
        System.out.println("days are sunny: "+sunny+" the proboplity is 0.4");
        System.out.println("days are cloudy: "+cloudy+" the proboplity is 0.3");
        System.out.println("days are rainy: "+rainy+" the proboplity is 0.2");
        System.out.println("days are stormy: "+stormy+" the proboplity is 0.1");

    }
}

