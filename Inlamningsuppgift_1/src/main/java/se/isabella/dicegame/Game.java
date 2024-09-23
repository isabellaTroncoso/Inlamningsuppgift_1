package se.isabella.dicegame;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Skapade min scanner.

        System.out.println("WELCOME TO DICE GAME");
        System.out.print("Player one: ");
        String playerNameOne = scanner.nextLine();
        Player player1 = new Player(playerNameOne); // Player-objektet.

        System.out.print("Player two: ");
        String playerNameTwo = scanner.nextLine();
        Player player2 = new Player(playerNameTwo);
        System.out.println();

        System.out.print("Press enter to start the game...");
        String start = scanner.nextLine();
        System.out.println();

        Dice dice = new Dice();                       // Tärnings-objektet.
        Scoreboard scoreboard = new Scoreboard();    // Poängsättnings-objektet.
        dice.rollDice(player1, player2);            // Anropar metoden dice i dice-klassen.
        scoreboard.decideWinner(player1, player2); // Anropar metoden decideWinner i
                                                  // scoreBoard-klassen.

    }


}

