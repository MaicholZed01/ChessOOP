package univaq.lpo.chess.model;

public interface IBoardGame {
    void start() throws InterruptedException;

    IPlayer RetrieveWinner();
}
