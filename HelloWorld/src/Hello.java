public class Hello {
    public static void main(String[] args){
        System.out.println("Hello, Person");

        boolean isAlwaysLearning = true;
        if (!isAlwaysLearning) {
            System.out.println("Lets get learning!");
        } else {
            System.out.println("It's always good to learn new things!");
        }
        int topScore = 50;
        if (topScore < 100){
            System.out.println("They are winning!");
        }

        int secondTopScore = 55;
        if (secondTopScore > topScore && topScore < 100){
            System.out.print("Greater than top score and less than 100!");
        }
    }
}
