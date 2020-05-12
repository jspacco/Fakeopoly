package fakeopoly;

public class Player {
    private int dollars;
    private String name;

    public Player(String name) {
        this.name = name;
        this.dollars = 1500;
    }

    public void addDollars(int dollars){
        if (dollars <= 0) {
            throw new IllegalArgumentException("Negative money is bad");
        }
        this.dollars += dollars;
    }
}
