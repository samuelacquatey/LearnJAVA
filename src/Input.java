import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String nameScanned = scanner.nextLine();

        System.out.println("How old are you?");
        int ageScanned = scanner.nextInt();

        scanner.nextLine();

        System.out.println("What is your favorite food?");
        String foodScanned = scanner.nextLine();

        System.out.println("Well Hello "+ nameScanned +"...I hear you are "+ ageScanned +" Years old. Now tell me, is that really true? :)\n " +
                "oh and by the way they say you like "+foodScanned);



    }
}
