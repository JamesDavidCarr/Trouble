public class Piece {

    private Player owner;
    private boolean inHome;

    public Piece(Player owner) {
        this.owner = owner;
        this.inHome = false;
    }

    public boolean inHome() {
        return inHome;
    }

    public void setInHome(boolean inHome) {
        this.inHome = inHome;
    }
}
