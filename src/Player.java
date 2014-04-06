public class Player {

    private final int NUMBER_OF_PIECES = 4;
    private String colour;
    private Piece[] pieces;

    public Player(String colour) {
        this.colour = colour;
        this.pieces = new Piece[NUMBER_OF_PIECES];
        for (int i = 0; i < pieces.length; i++) {
            pieces[i] = new Piece(this, Integer.toString(i+1));
        }
    }

    Piece[] getPieces() {
        return pieces;
    }

    public String getColour() {
        return colour;
    }

}
