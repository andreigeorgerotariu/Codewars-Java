package codewars.eightKyu;

// https://www.codewars.com/kata/5715eaedb436cf5606000381

public class SumOfPositive {

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sum += arr[i];
            }
        }
        return sum;
    }
}