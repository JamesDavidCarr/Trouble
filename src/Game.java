public class Game {

    private Board board;
    private Player[] players;

    public Game(int numPlayers, Player[] players) {
        this.board = new Board();
        this.players = players;
    }

    public boolean isOver() {
        for (Player player : players) {
            if (player.isFinished()) {
                return true;
            }
        }
        return false;
    }
}
