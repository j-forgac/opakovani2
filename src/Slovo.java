import java.util.Scanner;

public class Slovo {
    public static void main(String[] args) {
        Scanner mySc = new Scanner(System.in);
        String input = mySc.nextLine();
        String[] sentenceWords = input.split(" ");
        System.out.println(sentenceWords[sentenceWords.length - 2]);
    }
}