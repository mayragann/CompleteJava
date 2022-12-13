public class SecondChallenge {
    public static void main(String[] args) {

        int newHive = calculateBees(true,2,50);
        System.out.println("Your remaining empty frames are: " + newHive);
    }
    public static int calculateBees(boolean healthy, int hiveBox, int emptyFrames){

        int totalFramesLeft = emptyFrames;

        if(healthy){
            totalFramesLeft = (hiveBox * 10); // frames per box
            totalFramesLeft = emptyFrames - totalFramesLeft;
        }
        else{
            System.out.println("Need to work on your hives");
        }
        return totalFramesLeft;
    }
}
