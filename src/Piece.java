public class Piece {

    private Player owner;
    private String content;

    public Piece(Player owner, String content) {
        this.owner = owner;
        this.content = content;
    }

    public String toString() {
        return content;
    }

    Player getOwner() {
        return owner;
    }

}
