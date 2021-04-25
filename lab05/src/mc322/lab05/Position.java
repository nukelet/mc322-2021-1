package mc322.lab05;

class Position {
    private int i, j;
    private String strPosition;

    Position(String str) {
        this.j = (int) str.charAt(0) - 'a';
        this.i = (int) str.charAt(1) - '1';
        strPosition = str;
    }

    Position(int i, int j) {
        this.i = i;
        this.j = j;
        this.strPosition = String.format("%c%c", (char) 'a' + j, (char) '1' + i);
    }

    public int getI() {
        return this.i;
    }

    public int getJ() {
        return this.j;
    }

    public boolean equals(Position position) {
        if (this.i == position.getI() && this.j == position.getJ()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return strPosition;
    }
}
