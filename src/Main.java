import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> players = new LinkedList<>();
        players.add(1); // Player 1
        players.add(2); // Player 2

        // Create the board
        int boardSize = 100; // Standard Snake and Ladder board size
        Board board = new Board(boardSize, players);

        // Initialize dice and game logic
        Dice dice = new SingleDice();
        Snake snake = new Snake();
        Ladder ladder = new Ladder();
        HashMap<String, Integer> playerPositions = new HashMap<>();
        playerPositions.put("Player 1", 0);
        playerPositions.put("Player 2", 0);

        System.out.println("Starting the game!");
        boolean gameWon = false;

        while (!gameWon) {
            int currentPlayer = players.poll(); 
            String playerName = "Player " + currentPlayer;

            System.out.println(playerName + "'s turn.");

            int diceRoll = dice.getResult();
            System.out.println(playerName + " rolled a " + diceRoll + ".");

            int currentPosition = playerPositions.get(playerName);
            int newPosition = currentPosition + diceRoll;

            if (newPosition > boardSize) {
                System.out.println(playerName + " stays at " + currentPosition + " (roll exceeds board size).");
            } else {
                
                String entity = snake.snakeOrLadder(newPosition);
                if ("snake".equals(entity)) {
                    System.out.println(playerName + " encountered a snake!");
                    newPosition = snake.jump(newPosition);
                } else if ("ladder".equals(entity)) {
                    System.out.println(playerName + " climbed a ladder!");
                    newPosition = ladder.jump(newPosition);
                }

                System.out.println(playerName + " moves to " + newPosition + ".");
                playerPositions.put(playerName, newPosition);
            }

           
            if (newPosition == boardSize) {
                System.out.println(playerName + " wins the game!");
                gameWon = true;
            } else {
                players.add(currentPlayer); 
            }
        }
        board.displayScore(playerPositions);
    }
}