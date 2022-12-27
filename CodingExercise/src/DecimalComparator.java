public class DecimalComparator {
    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(-3.1756, -3.175);
    }
    public static boolean areEqualByThreeDecimalPlaces (double numberOne, double numberTwo){
        return (int) (numberOne * 1000) == (int) (numberTwo * 1000);
    }
}
