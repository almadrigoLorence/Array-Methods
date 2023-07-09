package StudentRoster;

public class Reverse {
    public static void countdown(){
//        Array count set to 10.
        int[] count = new int[10];

//        Counting in reverse from 10 through 1.
        System.out.println("Countdown: Reverse");
        for(int counting = count.length; counting >= 1; --counting){
            System.out.println(counting);
        }
    }
}
