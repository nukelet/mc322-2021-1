package emprestimo;

public class EmprestimoApp {
    public static void main(String[] args) {
        Emprestimo p1 = new Emprestimo(200, 5, 1);
        Emprestimo p2 = new Emprestimo(500, 7, 2);
        
        while (!p1.finalizado() || !p2.finalizado()) {
            if (!p1.finalizado()) {
                System.out.printf("(Emprestimo 1): %.2f\n", p1.proximaParcela());
            }

            if (!p2.finalizado()) {
                System.out.printf("(Emprestimo 2): %.2f\n", p2.proximaParcela());
            }

        }
    }
}
