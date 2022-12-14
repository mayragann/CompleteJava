public class PositiveNegativeOrZero {
    public static void main(String[] args) {
        checkNumber(-5);
    }
    public static void checkNumber(int number){

        int finalNumber = number;

        if (finalNumber > 0){
            System.out.println("positive");
        } else if (finalNumber < 0) {
            System.out.println("negative");
        }
        else {
            System.out.println("zero");
        }

    }

}
