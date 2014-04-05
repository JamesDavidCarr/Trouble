public class Player {

    private final int NUMBER_OF_PIECES = 4;
    private String colour;
    private Piece[] pieces;

    public Player(String colour) {
        this.colour = colour;
        this.pieces = new Piece[NUMBER_OF_PIECES];
    }

    public boolean isFinished() {
        for (Piece piece : pieces) {
            if (!piece.inHome()) {
                return false;
            }
        }
        return true;
    }
}
