package mc322.lab05;

import java.lang.Math;

class Pawn {
    private Position position;
    private Color color;

    Pawn(Position position, Color color) {
        this.position = position;
        this.color = color;
    }

    public boolean isValidMove(Position destination) {
        int i1 = position.getI(), j1 = position.getJ();
        int i2 = destination.getI(), j2 = destination.getJ();

        // indicates wheter a piece moves upwards or downwards
        // on the board when it's not capturing another piece
        int offset;
        if (getColor() == Color.WHITE) {
            // white pieces always go from a->h (0->7)
            offset = 1;
        } else {
            // black pieces always go from h->a (7->0)
            offset = -1;
        }
        
        // when moving without capturing a piece
        if (Math.abs(i1 - i2) == 1 && Math.abs(j1 - j2) == 1) {
            if (i2 == i1 + offset) {
                return true;
            } else {
                return false;
            }
        } // when capturing a piece
        else if (Math.abs(i1 - i2) == 2 && Math.abs(j1 - j2) == 2) {
            return true;
        } else {
            return false;
        }
    }
    
    public Position getPosition() {
    	return position;
    }
    
    // TODO: I think this isValidMove() check should be called from the
    // Board class, not from here
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
