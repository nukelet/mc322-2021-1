package mc322.lab05;

public class AppDama {

	public static String[] executaJogo(String csvPath) {
		CSVReader csvReader = new CSVReader();
		csvReader.setDataSource(csvPath);
		String[] commands = csvReader.requestCommands();
		
		String[] result = new String[commands.length];
		
		Board board = new Board();
		
		System.out.println(board);
		System.out.println();
		result[0] = board.getStateString();
		
		for (String command : commands) {
			board.executeCommand(command);	
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		executaJogo("lab05/resources/commands01.csv");
	}

}
