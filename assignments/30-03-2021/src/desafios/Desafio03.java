package desafios;

public class Desafio03 {
    static String dnaToRna(String str) {
        String rna = "";

        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'A':
                    rna += "U";
                    break;
                case 'T':
                    rna += "A";
                    break;
                case 'C':
                    rna += "G";
                    break;
                case 'G':
                    rna += "C";
                    break;
            }
        }

        return rna;
    }

    public static void main(String[] args) {
        String testCase = "TACTAGAGCATT";
        String out = dnaToRna(testCase);
        String solution = "AUGAUCUCGUAA";

        System.out.printf("In: %s\nOut: %s\n", testCase, out);

        if (out.equals(solution)) {
            System.out.println("Passed test case #1");
        } else {
            System.out.println("Failed test case #1");
        }
    }
}
