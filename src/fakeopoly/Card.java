package fakeopoly;

public abstract class Card {
    protected String description;

    public Card(String description){
        this.description = description;
    }

    public abstract void action(Player p);
}
