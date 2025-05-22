import java.util.Scanner;

public class RockPaperScissors {

    // Get computer choice randomly (0-rock, 1-paper, 2-scissors)
    public static int getComputerChoice() {
        return (int) (Math.random() * 3);
    }

    // Convert int choice to string
    public static String choiceToString(int choice) {
        switch (choice) {
            case 0: return "Rock";
            case 1: return "Paper";
            case 2: return "Scissors";
            default: return "";
        }
    }

    // Determine winner: 0=draw, 1=user wins, 2=computer wins
    public static int findWinner(int userChoice, int compChoice) {
        if (userChoice == compChoice) return 0;

        if ((userChoice == 0 && compChoice == 2) ||
            (userChoice == 1 && compChoice == 0) ||
            (userChoice == 2 && compChoice == 1)) {
            return 1;
        }
        return 2;
    }

    // Calculate stats and return 2D array of summary
    public static String[][] calculateStats(int totalGames, int userWins, int compWins) {
        int draws = totalGames - userWins - compWins;
        double userPercent = (totalGames == 0) ? 0 : (userWins * 100.0 / totalGames);
        double compPercent = (totalGames == 0) ? 0 : (compWins * 100.0 / totalGames);

        String[][] stats = {
            {"Total Games", String.valueOf(totalGames)},
            {"User Wins", String.valueOf(userWins)},
            {"Computer Wins", String.valueOf(compWins)},
            {"Draws", String.valueOf(draws)},
            {"User Win %", String.format("%.2f", userPercent)},
            {"Computer Win %", String.format("%.2f", compPercent)}
        };
        return stats;
    }

    // Display game results and stats in tabular format
    public static void displayResults(int[] userChoices, int[] compChoices, int[] winners) {
        System.out.println("Game\tUser Choice\tComputer Choice\tResult");
        for (int i = 0; i < userChoices.length; i++) {
            String result;
            switch (winners[i]) {
                case 0: result = "Draw"; break;
                case 1: result = "User Wins"; break;
                default: result = "Computer Wins";
            }
            System.out.printf("%d\t%s\t\t%s\t\t%s\n",
                    i + 1,
                    choiceToString(userChoices[i]),
                    choiceToString(compChoices[i]),
                    result);
        }
        // Calculate summary stats
        int userWins = 0, compWins = 0;
        for (int w : winners) {
            if (w == 1) userWins++;
            else if (w == 2) compWins++;
        }
        String[][] stats = calculateStats(userChoices.length, userWins, compWins);

        System.out.println("\nSummary:");
        for (String[] stat : stats) {
            System.out.printf("%-15s : %s\n", stat[0], stat[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games to play: ");
        int n = sc.nextInt();

        int[] userChoices = new int[n];
        int[] compChoices = new int[n];
        int[] winners = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Game " + (i + 1) + " - Enter choice (0=Rock,1=Paper,2=Scissors): ");
            int userChoice = sc.nextInt();
            if (userChoice < 0 || userChoice > 2) {
                System.out.println("Invalid choice, try again.");
                i--;
                continue;
            }
            int compChoice = getComputerChoice();

            int winner = findWinner(userChoice, compChoice);

            userChoices[i] = userChoice;
            compChoices[i] = compChoice;
            winners[i] = winner;
        }

        displayResults(userChoices, compChoices, winners);

        sc.close();
    }
}













