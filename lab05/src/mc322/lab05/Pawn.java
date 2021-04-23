package mc322.lab05;

import java.lang.Math;

class Pawn {
    Position position;
    Color color;

    Pawn(Position position, Color color) {
        this.position = position;
        this.color = color;
    }

    public boolean isValidMove(Position pos) {
        int i1 = position.getX(), j1 = position.getY();
        int i2 = pos.getX(), j2 = pos.getY();
        
        if (Math.abs(i1 - i2) == 1 && Math.abs(j1 - j2) == 1) {
            return true;
        } else {
            return false;
        }
    }
    
    public Position getPosition() {
    	return position;
    }

    public void setPosition(Position position) {
        if (isValidMove(position)) {
            this.position = position;
        } else {
            System.err.println("Invalid move: " + position.toString());
        }
    }
    
    public Color getColor() {
    	return color;
    }
    
    @Override
    public String toString() {
		switch (color) {
		case WHITE:
			return "b";
		case BLACK:
			return "p";
		}
		return "";
	}
}
