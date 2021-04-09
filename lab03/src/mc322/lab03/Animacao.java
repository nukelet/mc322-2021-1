package mc322.lab03;

class Animacao {
    // posicao na string de comandos
    int posicao;
    String comandos;
    AquarioLombriga aquarioLombriga;
    
    Animacao(String str) {
        int tamanhoAquario = Integer.parseInt(str.substring(0, 2));
        int tamanhoLombriga = Integer.parseInt(str.substring(2, 4));
        int posicaoLombriga = Integer.parseInt(str.substring(4, 6));
        
        comandos = str.substring(6);
        aquarioLombriga = new AquarioLombriga(
            tamanhoAquario,
            tamanhoLombriga,
            posicaoLombriga
        );
        
        posicao = 0;
    }
    
    String apresenta() {
        return aquarioLombriga.apresenta();
    }
    
    void passo() {
        if (posicao >= comandos.length()) { return; }
        
        switch (comandos.charAt(posicao)) {
            case 'M':
                aquarioLombriga.mover();
                break;
            case 'C':
                aquarioLombriga.crescer();
                break;
            case 'V':
                aquarioLombriga.virar();
                break;
        }
        
        posicao++;
    }
}
