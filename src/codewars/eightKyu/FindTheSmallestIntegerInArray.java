package codewars.eightKyu;

// https://www.codewars.com/kata/55a2d7ebe362935a210000b2

public class FindTheSmallestIntegerInArray {

    public static int findSmallestInt(int[] args) {
        int smallestInt = Integer.MAX_VALUE;
        for (int i = 0; i < args.length; i++) {
            if (args[i] < smallestInt) {
                smallestInt = args[i];
            }
        }
        return smallestInt;
    }
}