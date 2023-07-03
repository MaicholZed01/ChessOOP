package univaq.lpo.chess.model;

import java.util.ArrayList;

public class Board {
    private int altezza;
    private int base;
    private  ArrayList<IPiece> pieceList;

    private Board(int altezza , int base ,ArrayList<IPiece> pieceList){
        this.altezza = altezza;
        this.base= base;
        this.pieceList = pieceList;
    }


    public static Board CreateChessBoard(){
        //TODO: MANCANO I PEZZI!!!!
        return new  Board(8,8, new ArrayList<IPiece>());
    }
}
