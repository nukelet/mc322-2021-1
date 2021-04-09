package mc322.lab03;

class AppLab03 {
    public static void main(String[] args) {
        Animacao a = new Animacao("080403MCMVM");
        for (int i = 0; i < 6; i++) {
            System.out.println(a.apresenta());
            a.passo();
        }
    }
}
