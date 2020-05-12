package fakeopoly;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Player> players = new ArrayList<>();
    private Deck deck = new Deck();
    /*
    game board:
      property
      jail
      community chest / chance
      free parking
      go to jail

     */

    public Game() {
        players.add(new Player("alicia"));
        players.add(new Player("bob"));
        players.add(new Player("carlos"));
    }

    public void play() {
        int current = 0;

        while (true){
            Player p = players.get(current);

            move(p);

            // wrap around happening here
            current = (current + 1) % players.size();

            // check for end of game and break loop
            // right now this just makes sure we only do 1 move
            if (true) break;
        }
    }

    public void move(Player p) {
        // roll dice
        // move token
        // interact with the square
        //    buy property
        //    pay rent
        //    draw card

        deck.draw(p);
    }

    public static void main(String[] args){
        Game game = new Game();
        game.play();
    }

}
