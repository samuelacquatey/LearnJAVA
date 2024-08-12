import java.util.Random;

public class Randoms {
    public static void main(String[] arg){

        Random random = new Random();

        int y = random.nextInt();
        double z = random.nextDouble(0, 5);
        boolean x = random.nextBoolean();

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }
}
