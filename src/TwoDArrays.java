public class TwoDArrays {
    public static void main (String[] arg){

        String[][] carsByGarages = {
                                        {"Camaro", "Avante", "Cruze"},
                                        {"Avante", "Elantra", "N-Line"},
                                        {"Urus", "Purosangue", "GLE 63  S AMG"}
                                    };

        for (int i = 0; i < carsByGarages.length; i++){

            for (int j = 0; j < carsByGarages[i].length; j++){
                System.out.print(carsByGarages[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
