public class IFStatement {
    public static void main(String[] args){

        //Since this is not new to me i will just head on with the syntax
        int i = 0;
        if(i == 0){
            System.out.println("There was actually no point in verifying the previous conditions 😂");
        } else if (i < 5) {
            System.out.println("i is less than or equal to 5");
        } else if (i > 5) {

            System.out.println("i is greater than or equal to 5");
        }else {
            System.out.println("this is the line that no one would ever see");
        }

    }
    /*had to change the positions of some of the conditions. this is because one condition was satisfied
     earlier on in the code and for this reason another condition that i actually wanted to get satisfied wasn't satisfied
     */
}