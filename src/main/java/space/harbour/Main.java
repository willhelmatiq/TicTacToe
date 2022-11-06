package space.harbour;

import java.util.Scanner;

import static space.harbour.utils.GameModeUtils.gameModePvsP;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose game mode");
        System.out.println("1 for player vs CPU ");
        System.out.println("2 for player vs player");
        int gameMode = scanner.nextInt();
        if (gameMode == 1 ) {
            System.out.println("Sorry this mode still not available, but you can specify mode 2:");
            if(scanner.nextInt() == 2) {
                gameModePvsP();
            }
//            System.out.print("Enter player name: ");
//            String playerName = scanner.next();
//            Player player = new Player(playerName, 'X');
//            Board gameBoard = new Board();
//            gameBoard.initBoard();
//            System.out.println(gameBoard);
        }

        if (gameMode == 2 ) {
            gameModePvsP();
        }
    }


}