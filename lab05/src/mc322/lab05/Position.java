package mc322.lab05;

class Position {
    private final int i;
    private final int j;

    Position(String str) {
    	this((int)(str.charAt(1) - '1'), (int)(str.charAt(0) - 'a'));
    }

    Position(int i, int j) {
    	this.i = i;
    	this.j = j; 
    }

    public int getI() {
        return this.i;
    }

    public int getJ() {
        return this.j;
    }

    public boolean equals(Position position) {
    	return (this.i == position.getI() && this.j == position.getJ());
    }

    @Override
    public String toString() {
    	return String.format("%c%c", (char) 'a' + j, (char) '1' + i);
    }
}
