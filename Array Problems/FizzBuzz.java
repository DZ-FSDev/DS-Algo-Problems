import java.util.Arrays;

public class FizzBuzz {
    public static void main(String[] args) {

        System.out.println("FizzBuzz(1,8) --> " + Arrays.toString(fizzBuzz(1, 8)));
        System.out.println("FizzBuzz(30,36) --> " + Arrays.toString(fizzBuzz(30, 36)));
        System.out.println("FizzBuzz(14,20) --> " + Arrays.toString(fizzBuzz(1, 8)));

    }

    public static String[] fizzBuzz(int start, int end) {
        String[] fizzBuzzArr = new String[end - start];

        int currentNum = start;
        for (int i = 0; i < fizzBuzzArr.length; i++) {
            if (currentNum % 3 == 0 && currentNum % 5 == 0) {
                fizzBuzzArr[i] = "FizzBuzz";
            } else if (currentNum % 5 == 0) {
                fizzBuzzArr[i] = "Buzz";
            } else if (currentNum % 3 == 0) {
                fizzBuzzArr[i] = "Fizz";
            } else {
                fizzBuzzArr[i] = String.valueOf(currentNum);
            }

            currentNum += 1;
        }

        return fizzBuzzArr;
    }
}
