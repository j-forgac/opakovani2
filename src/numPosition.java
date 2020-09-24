import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class numPosition {
    public static void main(String[] args) {
        Scanner mySc = new Scanner(System.in);
        System.out.println("kolik cisel chcete zadat?");
        int amount = mySc.nextInt();
        String guess = "";

        mySc.nextLine();
        String[] nums = new String[amount + 1];
        System.out.println("---------");
        for (int i = 1; i <= amount; i++) {
            nums[i] = mySc.nextLine();
        }
        System.out.println("---------");

        List aList = Arrays.asList(nums);

        while (!guess.equals("quit")) {
            System.out.println("Input (quit to exit):");
            guess = mySc.nextLine();
            if (!guess.equals("quit")) {
                System.out.println("Output:");
                System.out.println(aList.indexOf(guess));
            }
        }
    }
}
