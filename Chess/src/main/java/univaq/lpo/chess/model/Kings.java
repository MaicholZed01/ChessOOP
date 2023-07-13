package univaq.lpo.chess.model;

public class Kings implements IPiece{
    private boolean isWhite ;
    private int x;
    private int y;
    private final int index;

    public Kings(boolean isWhite, int x, int y, int index){
        this.isWhite = isWhite;
        this.x = x;
        this.y = y;

        this.index = index;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public void setWhite(boolean white) {
        isWhite = white;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public String print() {
        return (this.isWhite ? "kw" : "kb") + "__" + index;

    }

}
