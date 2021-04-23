package mc322.lab05;

public class Board {
	Piece[][] board;
	
	public Board() {
		// 0 = empty, 1 = white, 2 = black
		int[][] piecesRepr = {
				{0, 1, 0, 1, 0, 1, 0, 1},
				{1, 0, 1, 0, 1, 0, 1, 0},
				{0, 1, 0, 1, 0, 1, 0, 1},
				{0, 0, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 0},
				{2, 0, 2, 0, 2, 0, 2, 0},
				{0, 2, 0, 2, 0, 2, 0, 2},
				{2, 0, 2, 0, 2, 0, 2, 0},
		};

		board = new Piece[8][8];

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				switch (piecesRepr[i][j]) {
				case 1:
					board[i][j] = new Piece(new Position(i, j), Color.WHITE);
					break;
				case 2:
					board[i][j] = new Piece(new Position(i, j), Color.BLACK);
					break;
				default:
					board[i][j] = null;
					break;
				}
			}
		}
	}
	
	public boolean executeCommand(String command) {
		Position source = new Position(command.substring(0, 2));
		Position target = new Position(command.substring(3, 5));
		System.out.println("Command: move from " + source.toString() + " to " + target.toString());
		return false;
	}
	
	public String getStateString() {
		String result = "";
		for (int i = 7; i >= 0; i--) {
			for (int j = 0; j < 8; j++) {
				result += ((board[i][j] == null) ? "-" : board[i][j].toString());
			}
			result += "\n";
		}
		return result;
	}
	
	@Override
	public String toString() {
		String result = "";
		for (int i = 7; i >= 0; i--) {
			result += (i + 1);
			for (int j = 7; j >= 0; j--) {
				result += " " + ((board[i][j] == null) ? "-" : board[i][j].toString());
			}
			result += "\n";
		}
		result += "  a b c d e f g h";
		return result;
	}
}
