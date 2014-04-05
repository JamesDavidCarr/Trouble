public class Player {

    private final int NUMBER_OF_PIECES = 4;
    private String colour;
    private Piece[] pieces;

    public Player(String colour) {
        this.colour = colour;
        pieces = new Piece[NUMBER_OF_PIECES];
        for (int i = 0; i < pieces.length; i++) {
            pieces[i] = new Piece(this);
        }
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
