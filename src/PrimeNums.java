import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNums {
    public static void main(String[] args) {

        Scanner mySc = new Scanner(System.in);
        int limitInt;

        do {
            System.out.println("Kolik prvocisel chcete vyfiltrovat?");
            String limitString = mySc.nextLine();
            try {
                limitInt = Integer.parseInt(limitString);
            } catch (java.lang.NumberFormatException e) {
                limitInt = 0;
            }
        } while (limitInt <= 1);

        ArrayList<Integer> primeNums = new ArrayList<>();
        ArrayList<Integer> compositeNums = new ArrayList<>();
        compositeNums.add(1);

        for (int primeNumCandidate = 2; primeNums.size() < limitInt; primeNumCandidate++) {
            if (!compositeNums.contains(primeNumCandidate)) {
                primeNums.add(primeNumCandidate);
                for (int multiple = 2; (multiple * primeNumCandidate) <= Math.pow(limitInt,2); multiple++) {
                    if (!compositeNums.contains(multiple * primeNumCandidate)) {
                        compositeNums.add(multiple * primeNumCandidate);
                    }
                }
            }
        }
        log(primeNums);
    }

    public static void log(ArrayList<Integer> primeNums) {
        System.out.println("\n-------------------");
        System.out.println("Prvocisla jsou:");
        primeNums.forEach((element) -> doLock(element));
    }

    public static void doLock(int input) {
        if (input != 0) {
            System.out.print(input + "-");
        }
    }
}