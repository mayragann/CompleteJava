public class LeapYear {
    public static void main(String[] args) {
        isLeapYear(-1600);
        isLeapYear(1600);

    }
    public static boolean isLeapYear(int year){
        if((year <= 1) || (year >= 9999)){
            return false;
        } else if (year % 4 == 0) {
            if (year % 100 != 0){
                return true;
            } else if (year % 100 == 0 && year % 400 == 0) {
                return true;
            }
            else{
                return false;
            }
        } else{
            return false;
        }
    }
}
