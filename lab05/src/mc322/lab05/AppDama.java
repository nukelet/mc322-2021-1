package mc322.lab05;

import java.util.Scanner;

public class AppDama {

	public static String[] executaJogo(String csvPath) {
		CSVReader csvReader = new CSVReader();
		csvReader.setDataSource(csvPath);
		String[] commands = csvReader.requestCommands();
		
		String[] result = new String[commands.length + 1];
		
		Board board = new Board();
		
		System.out.println(board);
		System.out.println();
		result[0] = board.getStateString();
		
		for (int i = 0; i < commands.length; i++) {
            String command = commands[i];
            Position source = new Position(command.substring(0, 2));
            Position target = new Position(command.substring(3, 5));
            System.out.println("Command: move from " + source.toString() + " to " + target.toString());
			board.doMove(source, target);
            result[i+1] = board.toString();
		}	
		return result;
	}
	
	public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Usage: mc322.lab05.AppDama <mode> [args]");
            System.err.println("mode: --csv, --console");
            System.exit(1);
        }

        if (args[0].equals("--csv")) {
            if (args.length != 2) {
                System.err.println("Usage: mc322.lab05.AppDama --csv <path-to-csv>");
                System.exit(1);
            }
            String[] results = executaJogo(args[1]);
            for (String line : results) {
                System.out.println(line + '\n');
            }
        } else if (args[0].equals("--console")) {
            Scanner scanner = new Scanner(System.in);
            Board board = new Board();
            System.out.println(board);

            while (true) {
                String command = scanner.nextLine();
                if (command.equals("end")) {
                    break;
                }

                Position source = new Position(command.substring(0, 2));
                Position target = new Position(command.substring(3, 5));
                System.out.println("Command: move from " + source.toString() + " to " + target.toString());
                board.doMove(source, target);

                System.out.println(board);
            }

            scanner.close();
        } else {
            System.err.println("Usage: mc322.lab05.AppDama <mode> [args]");
            System.err.println("mode: --csv, --console");
            System.exit(1);
        }
	}

}
