import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class numPosition {
    public static void main(String[] args) {
        Scanner mySc = new Scanner(System.in);
        System.out.println("kolik cisel chcete zadat?");
        int amount = mySc.nextInt();
        mySc.nextLine();
        String[] nums = new String[amount];
        String[] guessNums = new String[amount];
        System.out.println("---------");
        for (int i = 0; i < amount; i++) {
            nums[i] = mySc.nextLine();
        }
        System.out.println("---------");

        List aList = Arrays.asList(nums);
        for(int i = 0; i < amount; i++){
            System.out.println("Input:");
            guessNums[i] = mySc.nextLine();
            System.out.println("Output:");
            if (aList.indexOf(guessNums[i]) != -1){
                System.out.println(aList.indexOf(guessNums[i]) + 1);
            } else {
                System.out.println(aList.indexOf(guessNums[i]));
            }
        }
    }
}
