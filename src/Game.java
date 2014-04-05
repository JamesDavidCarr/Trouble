public class Game {

    private Board board;
    private Player[] players;

    public Game(int numPlayers, Player[] players) {
        this.board = new Board();
        this.players = players;
    }

    public boolean isOver() {
        for (Player player : players) {
            if (board.isFinished(player)) {
                return true;
            }
        }
        return false;
    }

    public void submit(int moves) {
        board.submit(moves);
    }
}
