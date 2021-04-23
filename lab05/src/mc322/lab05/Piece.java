package mc322.lab05;

public class Piece {
	enum PieceType { PAWN, QUEEN };
	
	PieceType type;
	Pawn pawn;
	Queen queen;
	
	public Piece(Position position, Color color) {
		this.type = PieceType.PAWN;
		this.pawn = new Pawn(position, color);
		this.queen = null;
	}
	
	public PieceType getType() {
		return type;
	}
	
	public Pawn getPawn() {
		return pawn;
	}
	
	public Queen getQueen() {
		return queen;
	}
	
	public Position getPosition() {
    	switch (type) {
    	case PAWN: 
    		return pawn.getPosition();
    	case QUEEN:
    		return queen.getPosition();
    	}
    	return null;
    }

    public void setPosition(Position position) {
        switch (type) {
        case PAWN:
        	pawn.setPosition(position);
        	break;
        case QUEEN:
        	queen.setPosition(position);
        	break;
        }
    }
	
	public Color getColor() {
		switch (type) {
		case PAWN:
			return pawn.getColor();
		case QUEEN:
			return queen.getColor();
		}
		return null;
	}
	
	@Override
	public String toString() {
		switch (type) {
		case PAWN:
			return pawn.toString();
		case QUEEN:
			return queen.toString();
		}
		return "";
	}
}
