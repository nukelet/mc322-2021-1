package mc322.lab04;

// Pieces can have two states: 'P' and '-'
class Piece {
    enum PieceState {
        ACTIVE,
        INACTIVE,
    }
    
    private PieceState state;

    Piece() {
        state = PieceState.ACTIVE;
    }

    public boolean isActive() {
        return state == PieceState.ACTIVE ? true : false;
    }

    public String toString() {
        return isActive() ? "P" : "-";
    }

    public void toggleState() {
        state = isActive() ? PieceState.INACTIVE : PieceState.ACTIVE;
    }

}
