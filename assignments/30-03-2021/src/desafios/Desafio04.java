package desafios;

import java.util.Random;

public class Desafio04 {
    // assumes the array does not have length 0
    static float getAverage(int[] v) {
        float avg = 0;
        for (int i = 0; i < v.length; i++) {
            avg += v[i];
        }

        return avg/v.length;
    }

    static int getAboveAverageCount(int[] v) {
        int count = 0;
        float avg = getAverage(v);
        for (int i = 0; i < v.length; i++) {
            if (v[i] > avg) {
                count++;
            }
        }

        return count;
    }

    static int[] getRandIntArray(int size, int lowerBound, int upperBound) {
        Random rand = new Random();
        int[] v = new int[size];
        for (int i = 0; i < size; i++) {
            // assuming an exclusive upperBound
            v[i] = lowerBound + rand.nextInt(upperBound - lowerBound);
        }

        return v;
    }

    static void printIntArray(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
    }

    public static void main(String[] args) {
        int[] v = getRandIntArray(50, 2500, 15000);
        // printIntArray(v);
        System.out.println("Salaries above average: " + getAboveAverageCount(v));
    }
}
