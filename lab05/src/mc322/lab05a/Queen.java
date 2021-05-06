package mc322.lab05;

public class Queen {
	Position position;
	Color color;
	
	Queen(Position position, Color color) {
		this.position = position;
		this.color = color;
	}
	
	public Position getPosition() {
    	return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
	
	public Color getColor() {
		return color;
	}
	
    public boolean isValidMove(Position destination) {
        int i1 = position.getI(), j1 = position.getJ();
        int i2 = destination.getI(), j2 = destination.getJ();

        if (Math.abs(i1 - i2) == Math.abs(j1-j2)) {
            return true;
        } else {
            return false;
        }
    }	
	
	@Override
	public String toString() {
		switch (color) {
		case WHITE:
			return "B";
		case BLACK:
			return "P";
		}
		return "";
	}
}
