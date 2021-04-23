package mc322.lab05;

class Position {
    private int x, y;
    String strPosition;

    Position(String str) {
        this.x = (int) str.charAt(0) - 'a';
        this.y = (int) str.charAt(1) - '1';
        strPosition = str;
    }

    Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    @Override
    public String toString() {
        return strPosition;
    }
}
