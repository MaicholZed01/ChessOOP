package univaq.lpo.chess.model;

import java.io.Serializable;

public class ChessGame implements IBoardGame, Serializable {
    private IPlayer playerOne;
    private IPlayer playerTwo;
    private Board chessBoard;
    private boolean isTurnOfPlayerOne;
    private boolean isFinishd;

    public ChessGame(IPlayer playerOne, IPlayer playerTwo, Board chessBoard ) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.chessBoard = chessBoard;
        this.isTurnOfPlayerOne = true;
        this.isFinishd = false;
    }
    public static ChessGame create(IPlayer playerOne, IPlayer playerTwo){
        return new ChessGame(playerOne, playerTwo, Board.CreateChessBoard());

    }

    @Override
    public void start() throws InterruptedException {

        //Counter attualmente è necessario per simulare lo scorrimento della partita
        int counter = 0;
        while(!this.isFinishd){
            IPlayer currentPlayer = getCurrentPlayer();
            System.out.println("Tocca a : " + currentPlayer.getName());
            this.chessBoard.PrintBoard();
            Thread.sleep(3000);
            counter++;

            if(counter == 10){
                this.isFinishd = true;
                break;
            }


            this.isTurnOfPlayerOne = !this.isTurnOfPlayerOne;
        }
    }
    @Override
    public IPlayer RetrieveWinner(){
        return getCurrentPlayer();
    }

    private IPlayer getCurrentPlayer(){
        if(isTurnOfPlayerOne){
            return playerOne;
        }
        return playerTwo;
    }
}
