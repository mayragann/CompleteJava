public class WeightConversion {
    public static void main(String[] args) {
        printConversion(200);
    }
    public static void printConversion(double kilosToPounds){
        if(kilosToPounds < 0){
            System.out.println("Invalid Weight");
        }
        else{
            System.out.println(kilosToPounds + "lbs is = " + toKilosToPounds(kilosToPounds) + "kgs.");
        }
    }

    public static long toKilosToPounds (double kilosToPounds){
        if(kilosToPounds < 0){
            return -1;
        } else {
            return Math.round(kilosToPounds/2.2);
        }
    }
}
