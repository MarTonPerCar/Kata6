package Kata6;

public class ArrayCalculator {
    public int Take_out_the_largest(int[] Numbers) {
        if (Numbers.length == 0) {
            return -102;
        } else if (Numbers.length == 1) {
            return Numbers[0];
        } else {
            int x = Numbers[0];
            for (int i = 1; i < Numbers.length; i++) {
                if (x < Numbers[i]) {
                    x = Numbers[i];
                }
            }
            return x;
        }
    }

    public int Take_out_the_minimum(int[] Numbers) {
        if (Numbers.length == 0) {
            return -102;
        } else if (Numbers.length == 1) {
            return Numbers[0];
        } else {
            int x = Numbers[0];
            for (int i = 1; i < Numbers.length; i++) {
                if (x > Numbers[i]) {
                    x = Numbers[i];
                }
            }
            return x;
        }
    }

    public int Take_out_the_middle_one(int[] Numbers) {
        if (Numbers.length == 0) {
            return -102;
        } else if (Numbers.length == 1) {
            return Numbers[0];
        } else {
            if (Numbers.length % 2 == 0) {
                int X = Numbers[(Numbers.length/2) - 1];
                return X + Numbers[(Numbers.length/2)];
            } else {
                return Numbers[(Numbers.length/2)];
            }
        }
    }
}
