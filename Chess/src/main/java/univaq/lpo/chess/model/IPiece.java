package univaq.lpo.chess.model;

public interface IPiece {
    boolean getIsWhite();

    int getX();
    int getY();
    boolean canMove(int endX, int endY, Board board);

    String print();
}
