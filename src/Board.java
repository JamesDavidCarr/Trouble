import java.util.Random;

public class Board {

    private static Random random;
    private final int BOARD_LENGTH = 11;
    private Piece[][] board;

    public Board() {
        this.random = new Random();
        this.board = new Piece[BOARD_LENGTH][BOARD_LENGTH];
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
