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
	
	public boolean isValidMove(Piece[] piecesUntilTarget) {
		// TODO: implement method
		return false;
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
