import java.util.Random;

public class Board {

    private static Random random;
    private final int BOARD_LENGTH = 11;
    private Piece[][] board;

    public Board(Player[] players) {
        this.random = new Random();
        this.board = new Piece[BOARD_LENGTH][BOARD_LENGTH];
        for (Player player : players) {
            String colour = player.getColour();
            if (colour.equals("Red")) {
                board[0][0] = new Piece(player, "1");
                board[0][1] = new Piece(player, "2");
                board[1][0] = new Piece(player, "3");
                board[1][1] = new Piece(player, "4");
            } else if (colour.equals("Blue")) {
                board[0][BOARD_LENGTH]   = new Piece(player, "1");
                board[0][BOARD_LENGTH-1] = new Piece(player, "2");
                board[1][BOARD_LENGTH]   = new Piece(player, "3");
                board[1][BOARD_LENGTH-1] = new Piece(player, "4");
            } else if (colour.equals("Green")) {
                board[BOARD_LENGTH][0]   = new Piece(player, "1");
                board[BOARD_LENGTH][1]   = new Piece(player, "2");
                board[BOARD_LENGTH-1][0] = new Piece(player, "3");
                board[BOARD_LENGTH-1][1] = new Piece(player, "4");
            } else if (colour.equals("Yellow")) {
                board[BOARD_LENGTH][BOARD_LENGTH]     = new Piece(player, "1");
                board[BOARD_LENGTH][BOARD_LENGTH-1]   = new Piece(player, "2");
                board[BOARD_LENGTH-1][BOARD_LENGTH]   = new Piece(player, "3");
                board[BOARD_LENGTH-1][BOARD_LENGTH-1] = new Piece(player, "4");
            } else {
                // Error caused by incorrect colour
            }
        }
    }

    public String toString() {
        for (int i = 0; i < BOARD_LENGTH; i++) {

        }

        return null;
    }

    private String printLine() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < BOARD_LENGTH; i++) {
            sb.append("+---");
        }
        sb.append("+");
        return sb.toString();
    }

    public boolean isFinished(Player player) {
        for(Piece piece : player.getPieces()) {
            if (!inHome(piece)) {
                return false;
            }
        }
        return true;
    }

    private boolean inHome(Piece piece) {
        return false;
    }

    private int rollDice() {
        return random.nextInt(6) + 1;
    }

    public void submit(int moves) {
        //Update the dice square at the centre of the board
    }
}
