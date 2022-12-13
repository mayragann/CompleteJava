public class Main {
    public static void main(String[] args) {

        int myVariable = 50;

        myVariable++;
        myVariable--;

        System.out.println("this is a test " + myVariable);

        System.out.println("This is " +
                "another" +
                " Still more.");
        int anotherVariable = 50;
        anotherVariable--;
        System.out.println("my variable, but this method is not clear and don't use this" + anotherVariable);

        myVariable = 0;

        if (myVariable == 0){
            System.out.println("It's now zero");
        }
    }
}
