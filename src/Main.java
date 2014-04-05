import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static Random random;
    HashMap<String, String> colourToANSI;

    public Main() {
        random = new Random();
        colourToANSI = new HashMap<String, String>();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many players?");
        int numPlayers = scanner.nextInt();
        while (numPlayers < 2 || numPlayers > 4) {
            System.out.println("There must be between 2 and 4 players.");
            numPlayers = scanner.nextInt();
        }
        HashSet<String> colours = newColourList();
        Player[] players = new Player[numPlayers];
        for (int i = 0; i < numPlayers; i++) {
            String colour;
            do {
                System.out.println(String.format("Player %d, choose a colour", i+1));
                colour = scanner.next();
            } while(!colours.contains(colour));
            players[i] = new Player(colour);
            colours.remove(colour);
        }
        Game game = new Game(numPlayers, players);

        int turn = 0;

        while (!game.isOver()) {
            int moves = rollDice();
            System.out.println(String.format("Player %d, your dice roll was %d", turn, moves));
            game.submit(moves);
            turn++;
        }
    }

    private static int rollDice() {
        return random.nextInt(6) + 1;
    }

    private static HashSet<String> newColourList() {
        HashSet<String> colours = new HashSet<String>();
        colours.add("Red");
        colours.add("Blue");
        colours.add("Green");
        colours.add("Yellow");
        return colours;
    }

}
