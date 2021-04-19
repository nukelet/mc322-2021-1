package mc322.lab04;

class AppRestaUm {
    public static String[] executaJogo(String pathToCSV) {
        Board board = new Board();

        CSVReader reader = new CSVReader();
        reader.setDataSource(pathToCSV);
        String[] commands = reader.requestCommands();

        String[] output = new String[commands.length + 1];
        output[0] = "Tabuleiro inicial:\n" + board.toString(); 

        for (int i = 0; i < commands.length; i++) { 
            String command = commands[i];
            board.doMove(command);
            output[i+1] = String.format("Source: %s\nTarget: %s\n%s",
                    command.split(":")[0], command.split(":")[1],
                    board.toString());
        }

        for (String line : output) {
            System.out.println(line);
        }

        return output;
    }

    public static void main(String[] args) {
        String pathToCSV = args[0];
        executaJogo(pathToCSV);
    }
}
