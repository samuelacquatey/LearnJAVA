import java.util.Scanner;

public class Switches {
    public static void main(String[] arg){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Guess a day of the week (Sun - Wed");
        System.err.println("NB: Make sure the day Starts with a Capital letter.");
        String day = scanner.nextLine();

        switch (day){
            case "Sunday": System.out.println("LOL😝 You guessed the wrong!!");
            break;
            case "Monday": System.out.println("LOL😝 Yup guessed the wrong!!");
            break;
            case "Tuesday": System.out.println("LOL😝 yeah you guessed the wrong!!");
            break;
            case "Wednesday": System.out.println("Okay Okay you were lucky this time😒");
            break;
        }
    }
}
