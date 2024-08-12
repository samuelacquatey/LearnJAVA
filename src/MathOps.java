import java.util.Scanner;

public class MathOps {
    public static void main(String[] arg){
        double x = 12;
        double y = -16;
        double z = 3.14;

        //absolute
        double ops1 = Math.sqrt(Math.abs(y));

        double ops2 = Math.ceil(z);
        double ops3 = Math.floor(z);

        double ops4 = Math.min(y, z);
        double ops5 = Math.max(y, z);



        System.out.println(ops1);
        System.out.println(ops2);
        System.out.println(ops3);
        System.out.println(ops4);
        System.out.println(ops5);

        //PROJECT: FIND THE HYPOTHENEUS OF A TRIANGLE

        //Intitialise Scanner Object
        Scanner scanner = new Scanner(System.in);

        System.out.println("Value of Opposite: ");
        double opposite = scanner.nextDouble();

        System.out.println("Value of the Adjacent: ");
        double adjacent = scanner.nextDouble();

        double hypotheneuse =Math.sqrt(Math.pow(opposite, 2) + Math.pow(adjacent, 2));

        System.out.println("Given the opposite value "+ opposite+ " and the adjacent value "+ adjacent+ " The value of the hypotheneuse is: \n"+
                hypotheneuse);

        scanner.close();
    }
}
