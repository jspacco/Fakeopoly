package fakeopoly;

import java.util.LinkedList;
import java.util.List;

public class Deck {
    private List<Card> deck = new LinkedList<>();
    private List<Card> discard = new LinkedList<>();

    public void draw(Player player){
        // TODO: if deck is empty, shuffle discard deck and replace everything
        Card card = deck.remove(0);
        card.action(player);
        discard.add(card);
    }

    public Deck() {
        // create all the cards
        deck.add(new Card("advance to boardwalk") {
            public void action(Player player){
                // TODO: change location of player token
                System.out.println("Change location of player token to BOARDWALK");
            }
        });
        deck.add(new Card("advance to go"){
            public void action(Player player){
                // TODO: change location of player token
                System.out.println("Change location of player token to GO");
            }
        });
        deck.add(new Card("bank error in your favor, collect $75"){
            public void action(Player player){
                player.addDollars(75);
            }
        });
    }
}
