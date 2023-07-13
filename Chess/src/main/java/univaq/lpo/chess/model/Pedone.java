package univaq.lpo.chess.model;

public final class Pedone implements IPiece{
    private boolean isWhite;
    private int x;
    private int y;
    private final int index;

    public Pedone(boolean isWhite, int x, int y, int index){

        this.isWhite = isWhite;
        this.x = x;
        this.y = y;
        this.index = index;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public String print() {
        return (this.isWhite ? "pw" : "pb")+ "__" + index;
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
}
