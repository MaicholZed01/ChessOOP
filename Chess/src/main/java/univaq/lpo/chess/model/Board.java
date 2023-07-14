package univaq.lpo.chess.model;

import java.util.ArrayList;
import java.util.HashMap;

public class Board{
    private int height;
    private int width;
    private IPiece[][] pieces;

    private Board(int height, int width, IPiece[][] pieces) {
        this.height = height;
        this.width = width;
        this.pieces = pieces;
    }
    public static Board CreateChessBoard(){
        int width = 8;
        int height = 8;
        IPiece[][] pieces = new IPiece[width][height];

        for (int j= 0; j<height; j++){
            pieces[1][j] = new Pedone(true, 1, j, j +1);
            pieces[6][j] = new Pedone(false, 6, j, j+1);
        }

        pieces[0][0] = new Towers(true, 0, 0,1);
        pieces[0][7] = new Towers(true, 0, 7,2);
        pieces[7][0] = new Towers(false, 7, 0,1);
        pieces[7][7] = new Towers(false, 7, 7,2);

        pieces[0][1] = new Horse(true, 0, 1,1);
        pieces[0][6] = new Horse(true, 0, 6,2);
        pieces[7][1] = new Horse(false, 7, 1,1);
        pieces[7][6] = new Horse(false, 7, 6,2);

        pieces[0][2] = new Bishops(true, 0, 2,1);
        pieces[0][5] = new Bishops(true, 0, 5,2);
        pieces[7][2] = new Bishops(false, 7, 2,1);
        pieces[7][5] = new Bishops(false, 7, 5,2);

        pieces[0][3] = new Queens(true, 0, 3,1);
        pieces[0][4] = new Kings(true, 0, 4,1);

        pieces[7][4] = new Queens(false, 7, 4,1);
        pieces[7][3] = new Kings(false, 7, 3,1);


        return new Board(height,width, pieces);
    }


    public void PrintBoard(){
        for (int i = 0; i < this.width;i++){
            System.out.println("-----------------------------------------------------------------");
            for (int j = 0; j < this.height ; j++){
                if(j == 0){
                    System.out.print("|");
                }
                if(pieces[i][j] == null){
                    System.out.print(" empty |");
                    continue;
                }

                System.out.print(" " + pieces[i][j].print() + " |");
            }

            System.out.println("");
        }
        System.out.println("-----------------------------------------------------------------");
    }
    public IPiece getPieceAt(int x , int y){
        return this.pieces[x][y];
    }

}
