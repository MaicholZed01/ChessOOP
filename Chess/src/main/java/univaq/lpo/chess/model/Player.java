package univaq.lpo.chess.model;

public class Player implements IPlayer{
    private final String name;
    private final boolean isFirst;

    public Player(String name, boolean isFirst) {
        this.name = name;
        this.isFirst = isFirst;
    }

    public String getName() {
        return name;
    }

    public boolean isFirst() {
        return isFirst;
    }

}
