import java.util.Scanner;

public class Arrays {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);

        String[] cars = {"Urus", "Avante", "Purosangue", "G Wagon"};

        String[] myCars = new String[3];

        System.out.println("Enter the names of your car");

        for(int i = 0; i < myCars.length; i++){
            myCars[i] = scanner.nextLine();
        }

        for (int i = 0; i <3; i++){
            System.out.println(myCars[i]);
        }

    }
}
