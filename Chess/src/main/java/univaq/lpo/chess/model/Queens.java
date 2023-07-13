package univaq.lpo.chess.model;


public class Queens implements IPiece{
    private boolean isWhite;
    private int x ;
    private int y;
    private final int index;

    public Queens(boolean isWhite, int x , int y, int index){
        this.isWhite = isWhite;
        this.x = x;
        this.y = y;
        this.index = index;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String print() {
        return (this.isWhite ? "qw" : "qb") + "__" + index;

    }
}
