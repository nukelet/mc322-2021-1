package desafios;

public class Desafio01 {
    static float proximaParcela(float S, float J) {
        return S *= (1+J/100);
    }

    public static void main(String[] args) {
        float S = 200;
        int N = 5;
        float J = 1;

        for (int i = 0; i < N; i++) {
            System.out.printf("%.2f\n", S);
            S = proximaParcela(S, J);
        }
    }
}
