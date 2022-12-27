public class EqualSumChecker {
    public static void main(String[] args) {
        hasEqualSum(1, 1, 2);
        hasEqualSum(1, 1, 3);
    }
    public static boolean hasEqualSum(int x, int y, int z){
        boolean hasEqual = true;
        if ((x+y) == z){
            hasEqual = true;
            System.out.println("Good");
        }
        else {
            hasEqual = false;
            System.out.println("Bad");
        }
        return hasEqual;

    }
}
