public class Hello {
    public static void main(String[] args){
        System.out.println("Hello, Person");

        boolean isAlwaysLearning = true;
        if (!isAlwaysLearning) {
            System.out.println("Lets get learning!");
        } else {
            System.out.println("It's always good to learn new things!");
        }
/*
        int topScore = 80;
        if (topScore < 100){
            System.out.println("They are winning!");
        }

        int secondTopScore = 95;
        if ((secondTopScore > topScore) && (topScore < 100)){
            System.out.print("Greater than top score and less than 100!");
        }
        if ((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both of the conditions are true");
        }
*/

        int newValue = 50;
        if (newValue == 50){
            System.out.println("This is not an error");
        }
        boolean isCar = false;
        if (isCar == true){
            System.out.println("This isn't supposed to happen");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar != "Volkswagen";

        if (isDomestic){
            System.out.println("This car is domestic to our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);
        
        int ageOfClient = 16;
        String ageText = (ageOfClient >= 18) ? "Over Eighteen" : "Still a kid";
        System.out.println("Our Client is " + ageOfClient);
    }

}
