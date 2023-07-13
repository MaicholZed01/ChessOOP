package org.example;


import univaq.lpo.chess.model.*;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci Nome Del Giocatore 1");
        IPlayer playerOne = new Player(scanner.nextLine(), true);

        System.out.println("Inserisci Nome Del Giocatore 2");
        IPlayer playerTwo = new Player(scanner.nextLine(), false);
        IBoardGame game = ChessGame.create(playerOne , playerTwo);
        game.start();
        IPlayer winner = game.RetrieveWinner();

        System.out.println("And the winner is: " + winner.getName());
    }
}