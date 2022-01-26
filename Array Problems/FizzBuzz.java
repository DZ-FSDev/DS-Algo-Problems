import java.util.Arrays;

/**
 * The FizzBuzz problem is a classic test given in coding interviews. The task
 * is simple: Print a squence of integers, but print “Fizz” if an integer is
 * divisible by 3, “Buzz” if an integer is divisible by 5, and “FizzBuzz” if
 * an integer is divisible by both 3 and 5.
 * 
 * @author Karan-Brar
 * @version 1.0.0
 */
public class FizzBuzz {
    public static void main(String[] args) {

        System.out.println("FizzBuzz(1,8) --> " + Arrays.toString(fizzBuzz(1, 8)));
        System.out.println("FizzBuzz(30,36) --> " + Arrays.toString(fizzBuzz(30, 36)));
        System.out.println("FizzBuzz(14,20) --> " + Arrays.toString(fizzBuzz(1, 8)));

    }

    /**
     * Returns a String array containing integers counting up within a
     * specified range; replaces any integer that is divisible by 3 with
     * “Fizz”; any integer is divisible by 5 with “Buzz”; and “FizzBuzz” if
     * an integer is divisible by both 3 and 5.
     * 
     * @param start The specified integer to start the FizzBuzz.
     * @param end The specified integer to stop at for the FizzBuzz.
     * @return A String array containing integers counting up within a
     *         specified range; replaces any integer that is divisible by 3
     *         with “Fizz”; any integer is divisible by 5 with “Buzz”; and
     *         “FizzBuzz” if an integer is divisible by both 3 and 5.
     */
    public static String[] fizzBuzz(int start, int end) {
        String[] fizzBuzzArr = new String[end - start];

        for (int i = 0, currentNum = start; i < fizzBuzzArr.length; i++, currentNum++) {
            fizzBuzzArr[i] = String.valueOf(currentNum);
            if (currentNum % 3 == 0) {
                fizzBuzzArr[i] = "Fizz";
            }
            if (currentNum % 5 == 0) {
                fizzBuzzArr[i] = fizzBuzzArr[i] == null ?
                                 "Buzz" : "FizzBuzz";
            }
        }

        return fizzBuzzArr;
    }
}
