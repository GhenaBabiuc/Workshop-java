package oop.lessonII.exerciseI;

public class NumberMethods {
    public boolean consecutiveNumbers(int a, int b, int c) {
        int[] n = new int[3];
        n[0] = a;
        n[1] = b;
        n[2] = c;

        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < 3; i++) {
                if (n[i] < n[i - 1]) {
                    int tmp = n[i - 1];
                    n[i - 1] = n[i];
                    n[i] = tmp;
                    swapped = true;
                }
            }
        } while (swapped);

        return n[1] == n[0] + 1 && n[2] == n[0] + 2;
    }

    public boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    public int reverseDigits(int n) {
        int s = 0;

        while (n != 0) {
            s += n % 10;
            n /= 10;
            if (n != 0) {
                s *= 10;
            }
        }

        return s;
    }

    public int firstDigit(int n) {
        while (n != 0) {
            n /= 10;
            if (n / 10 == 0) {
                break;
            }
        }
        return n;
    }
}
