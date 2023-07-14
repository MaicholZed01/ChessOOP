package univaq.lpo.chess.model;

import static java.lang.Math.abs;

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


    @Override
    public boolean getIsWhite() {
        return false;
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

    public boolean canMove(int endX, int endY, Board board) {

        if(!IsValid(endX, endY))
            return false;

        int initionalPosition = this.getIsWhite() ? 1 : 6;
        boolean isInStartingPosition = initionalPosition == this.getX();
        int maxXStep = isInStartingPosition ? 2 : 1;

        if(this.getIsWhite()){
            if(this.getX() + maxXStep < endX) {
                return false;
            }
        }else{
            if(this.getX() - maxXStep > endX){
                return false;
            }
        }


        if(board.getPieceAt(endX,endY) != null && this.getY() == endY){
            return false;
        }

        return this.getY() == endY || board.getPieceAt(endX, endY) != null;
    }

    private boolean IsValid(int endX, int endY){
        if(this.getIsWhite()){
            if(this.getX() >= endX)
                return false;
        }else{
            if(this.getX() <= endX)
                return false;
        }


        return abs(endY - this.getY()) <= 1;
    }
}
