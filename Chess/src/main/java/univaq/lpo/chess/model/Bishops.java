package univaq.lpo.chess.model;

public class Bishops implements IPiece{
    private boolean isWhite;
    private int x ;
    private int y ;
    private final int index;

    public Bishops(boolean isWhite, int x, int y, int index){
        this.isWhite = isWhite;
        this.x = x;
        this.y = y;
        this.index = index;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public void setWhite(boolean white) {
        isWhite = white;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    @Override
    public String print() {
        return  (this.isWhite ? "bw" : "bb") + "__" + index;
    }
}
