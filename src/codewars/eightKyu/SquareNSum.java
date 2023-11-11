package codewars.eightKyu;

// https://www.codewars.com/kata/515e271a311df0350d00000f

public class SquareNSum {
    public static int squareSum(int[] n) {
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum += n[i] * n[i];
        }
        return sum;
    }
}