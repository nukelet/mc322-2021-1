package emprestimo;

public class Emprestimo {
    double parcelaInicial;
    int numeroParcelas;
    double taxaJuros;

    double parcelaAtual;
    int numeroParcelaAtual;

    Emprestimo(double parcelaInicial, int numeroParcelas, double taxaJuros) {
        this.parcelaInicial = parcelaInicial;
        this.numeroParcelas = numeroParcelas;
        this.taxaJuros = taxaJuros;

        this.parcelaAtual = parcelaInicial;
        this.numeroParcelaAtual = 0;
    }
    
    double proximaParcela() {
        if (numeroParcelaAtual != 0) {
           parcelaAtual *= (1+taxaJuros/100);
        }

        if (numeroParcelaAtual < numeroParcelas) {
            numeroParcelaAtual++;
        }

        return parcelaAtual;
    }

    boolean finalizado() {
        return numeroParcelaAtual == numeroParcelas;
    }
}
