package mc322.lab04;

class Board {
    private Piece[][] board = new Piece[7][7];
    
    // Piece objects are only assigned to valid
    // positions on the board; positions outside
    // of the board bounds (a0, b0, a1, b1, ...)
    // have a null pointer
    Board() {
        int[][] layout = { {0, 0, 1, 1, 1, 0, 0 },
                           {0, 0, 1, 1, 1, 0, 0 },
                           {1, 1, 1, 1, 1, 1, 1 },
                           {1, 1, 1, 1, 1, 1, 1 },
                           {1, 1, 1, 1, 1, 1, 1 },
                           {0, 0, 1, 1, 1, 0, 0 },
                           {0, 0, 1, 1, 1, 0, 0 }};

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (layout[i][j] == 1) {
                    board[i][j] = new Piece();
                }
            }
        }
        
        // turns the center position into a hole
        board[3][3].toggleState();
    }
    
    // returns a String representing the board state
    public String toString() {
        String str = "";

        for (int i = 6; i >= 0; i--) {
            str += (i+1) + " ";
            for (int j = 0; j < 7; j++) {
                Piece piece = board[i][j];
                String c = piece == null ? " " : piece.toString();
                str += c + " ";

            }
            str += "\n";
        }

        str += "  a b c d e f g\n";

        return str;
    }

    public Piece pieceAt(int i, int j) {
        return board[i][j];
    }

    private void swapPiecesAt(int i1, int j1, int i2, int j2) {
        Piece tmp = board[i1][j1];
        board[i1][j1] = board[i2][j2];
        board[i2][j2] = tmp;
    }

    private boolean isValidMove(int i1, int j1, int i2, int j2) {
        // location not within the board 
        if (pieceAt(i1, j1) == null || pieceAt(i2, j2) == null) {
            System.err.println("Jump is out of bounds");
            return false;
        }
        
        // checks if the move corresponds to a jump of size 2
        // to the left/right/up/down
        boolean isValidJump;
        if (Math.abs(i1 - i2) == 2 && j1 == j2) {
            isValidJump = true;
        } else if (i1 == i2 && Math.abs(j1 - j2) == 2) {
            isValidJump = true;
        } else {
            isValidJump = false;
        }

        if (!isValidJump) {
            System.err.println("Invalid jump destination");
            return false;
        }
       
        // checks wheter there is an active piece between
        // initial and final position and whether there is
        // an inactive piece at the destination
        int iMid = (i1 + i2)/2;
        int jMid = (j1 + j2)/2;

        if (!pieceAt(iMid, jMid).isActive()) {
            System.err.println("No active piece between start and finish");
            return false;
        }
        if (pieceAt(i2, j2).isActive()) {
            System.err.println("Active piece at destination");
            return false;
        }

        return true;
    }
    
    // returns true if the move was completed (i.e. if
    // the move is valid) and false if the move was invalid
    public boolean doMove(String str) {
        String pos1 = str.split(":")[0];
        String pos2 = str.split(":")[1];
        
        // converts from the position in the [a-g][1-7]
        // notation to matrix indices
        int j1 = pos1.charAt(0) - 'a', i1 = pos1.charAt(1) - '0' - 1;
        int j2 = pos2.charAt(0) - 'a', i2 = pos2.charAt(1) - '0' - 1;
        
        if (!isValidMove(i1, j1, i2, j2)) {
            System.err.println("Invalid move: " + str);
            return false;
        }
        
        int iMid = (i1 + i2)/2;
        int jMid = (j1 + j2)/2;


        pieceAt(iMid, jMid).toggleState();
        swapPiecesAt(i1, j1, i2, j2);

        return true;
    }
}
