package mc322.lab03;

class AquarioLombriga {
    int tamanhoAquario;
    int tamanhoLombriga;
    
    int posicaoCabeca;
    int posicaoCauda;
    // direita = 1, esquerda = -1
    int orientacao;
    
    AquarioLombriga(int tamanhoAquario, int tamanhoLombriga, int posicaoCauda) {
        this.tamanhoLombriga = tamanhoLombriga;
        
        if (tamanhoLombriga > tamanhoAquario) {
            this.tamanhoAquario = tamanhoLombriga;
        } else {
            this.tamanhoAquario = tamanhoAquario;
        }
        
        if (posicaoCauda + tamanhoLombriga - 1 <= tamanhoAquario) {
            this.posicaoCauda = posicaoCauda;
            this.posicaoCabeca = posicaoCauda + tamanhoLombriga - 1;
        } else {
            this.posicaoCauda = 1;
            this.posicaoCabeca = tamanhoLombriga;
        }

        this.orientacao = 1;
    }
    
    String apresenta() {
        char[] str = new char[tamanhoAquario];
        for (int i = 0; i < str.length; i++) {
            str[i] = '#';
        }
        
        int pos = posicaoCauda - 1;
        while (pos != posicaoCabeca - 1) {
            str[pos] = '@';
            pos += orientacao;
        }
        str[pos] = '0';
        
        return new String(str);
    }
    
    void print() {
        System.out.println(apresenta());
        return;
    }
    
    boolean posicaoDentroLimites(int pos) {
        return 0 < pos && pos <= tamanhoAquario;
    }
    
    void crescer() {
        int proximaPosicaoCauda = posicaoCauda + (-orientacao);
        if (!posicaoDentroLimites(proximaPosicaoCauda)) { return; }
        posicaoCauda += -orientacao;
        tamanhoLombriga++;
    }
    
    void virar() {
        orientacao *= -1;
        int tmp = posicaoCauda;
        posicaoCauda = posicaoCabeca;
        posicaoCabeca = tmp;
    }
    
    void mover() {
        int proximaPosicaoCabeca = posicaoCabeca + orientacao;
        if (posicaoDentroLimites(proximaPosicaoCabeca)) {
            posicaoCabeca += orientacao;
            posicaoCauda += orientacao;
        } else {
            virar();
        }
    }
}
