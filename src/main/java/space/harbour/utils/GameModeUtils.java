package space.harbour.utils;

import space.harbour.Player;
import space.harbour.domain.Board;

import java.util.Scanner;

public class GameModeUtils {
    public static void gameModePvsP(){
        int row;
        int column;
        boolean noOneWin = true;
        System.out.print("Enter player1 name: ");
        Scanner scanner = new Scanner(System.in);
        String player1Name = scanner.next();
        Player player1 = new Player(player1Name, 'X');

        System.out.print("Enter player2 name: ");
        String player2Name = scanner.next();
        Player player2 = new Player(player2Name, 'O');

        Board gameBoard = new Board();
        gameBoard.initBoard();
        System.out.println("Enter two numbers separated by space(row and column) to make move");
        int moveCount = 0;
        System.out.println(gameBoard);
        while (noOneWin && moveCount < 9){
            System.out.print(player1.getName() + " turn: ");
            row = scanner.nextInt();
            column = scanner.nextInt();
            if (!gameBoard.moveAllowed(row, column)) {
                while (!gameBoard.moveAllowed(row, column)) {
                    System.out.print("this move not allowed, please try again: ");
                    row = scanner.nextInt();
                    column = scanner.nextInt();
                }
            }

            player1.makeAMove(gameBoard, row, column);
            moveCount++;
            if (gameBoard.isPlayerWin(player1.getAChar())){
                System.out.println(player1.getName() + " won. ");
                noOneWin = false;
            }
            if (moveCount == 9) {
                System.out.println("draw");
                return;
            }
            System.out.println(gameBoard);
            System.out.print(player2.getName() + " turn: ");
            row = scanner.nextInt();
            column = scanner.nextInt();
            if (!gameBoard.moveAllowed(row, column)) {
                while (!gameBoard.moveAllowed(row, column)) {
                    System.out.print("this move not allowed, please try again: ");
                    row = scanner.nextInt();
                    column = scanner.nextInt();
                }
            }

            player2.makeAMove(gameBoard, row, column);
            moveCount++;
            if (gameBoard.isPlayerWin(player2.getAChar())){
                System.out.println(player2.getName() + " won. ");
                noOneWin = false;
            }
            System.out.println(gameBoard);
        }
        if (noOneWin){
            System.out.println("draw");
        }
        scanner.close();
    }
}
