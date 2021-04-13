package desafios;

import java.util.Random;

public class Desafio02 {
    static String decToString(int n) {
        String str = "";

        while (n > 0) {
            if (n%2 == 1) {
                str = "1" + str;
            } else {
                str = "0" + str;
            }
            n /= 2;
        }

        return str != "" ? str : "0";
    } 

    public static void main(String[] args) {
        Random rand = new Random();
        // assuming an exclusive upper bound of (9999)
        int randInt = rand.nextInt(9999);
        System.out.println("Dec: " + randInt);
        System.out.println("Bin: " + decToString(randInt));
    }
}
