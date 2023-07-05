package RGMCode;

public class Main {
    public static void main(String[] args) {
    }

    public static String fizzbuzz(int proofNum){
        if (proofNum % 3 == 0 && proofNum % 5 == 0) {
            return "fizzbuzz";
        } else if (proofNum % 5 == 0) {
            return "buzz";
        } else if (proofNum % 3 == 0) {
            return "fizz";
        } else {
            return String.valueOf(proofNum);
        }
    }

    public static boolean smalerThanZero(int num){
        if (num > 0){
            return true;
        } else {
            return false;
        }
    }

    public static int sumSquareOrSubstract(int num1, int num2){
        if (num1 > num2){
            return num1 + num2;
        } else {
            return num1 * num2;
        }
    }

}