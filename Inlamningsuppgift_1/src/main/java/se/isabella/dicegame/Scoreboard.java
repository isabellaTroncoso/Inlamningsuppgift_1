package se.isabella.dicegame;

public class Scoreboard {

    public void decideWinner(Player player1, Player player2) {
        System.out.println(player1.getName() + " total score: " + player1.getScore());
        System.out.println(player2.getName() + " total score: " + player2.getScore());
        System.out.println(".....................");

        if (player1.getScore() > player2.getScore()) {          //Om spelaren 1 poäng är större än spelaren 2.
            System.out.println(player1.getName() + " Wins!!"); // så vinner spelare 1.
        } else if (player1.getScore() < player2.getScore()) { // Omvänt >.
            System.out.println(player2.getName() + " Wins!!");

        } else {
            System.out.println("Tie!"); // Istället för att göra == med if stats.
        }
    }

}
