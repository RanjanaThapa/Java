import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {
    public static void main(String[] args) {
        // Array to store the options
        String[] options = {"Rock", "Paper", "Scissors"};

        // Create a Scanner object for reading user input
        Scanner scanner = new Scanner(System.in);

        // Create a Random object for generating computer choices
        Random random = new Random();

        // Keep track of the number of games and scores
        int userScore = 0;
        int computerScore = 0;
        int numberOfGames = 0;

        while (true) {
            // Get computer choice
            int computerChoiceIndex = random.nextInt(3);
            String computerChoice = options[computerChoiceIndex];

            // Get user choice
            System.out.print("Enter Rock, Paper, or Scissors (or 'exit' to quit): ");
            String userChoice = scanner.nextLine();

            // Check if the user wants to exit the game
            if (userChoice.equalsIgnoreCase("exit")) {
                break;
            }

            // Validate user input
            if (!userChoice.equalsIgnoreCase("Rock") && 
                !userChoice.equalsIgnoreCase("Paper") && 
                !userChoice.equalsIgnoreCase("Scissors")) {
                System.out.println("Invalid choice. Please enter Rock, Paper, or Scissors.");
                continue;
            }

            // Increment the number of games played
            numberOfGames++;

            // Determine the winner
            System.out.println("Computer chose: " + computerChoice);
            if (userChoice.equalsIgnoreCase(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((userChoice.equalsIgnoreCase("Rock") && computerChoice.equals("Scissors")) ||
                       (userChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Rock")) ||
                       (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equals("Paper"))) {
                System.out.println("You win!");
                userScore++;
            } else {
                System.out.println("Computer wins!");
                computerScore++;
            }

            // Display current scores
            System.out.println("Scores - You: " + userScore + ", Computer: " + computerScore);
        }

        // Display final results
        System.out.println("Game Over!");
        System.out.println("Total games played: " + numberOfGames);
        System.out.println("Final Scores - You: " + userScore + ", Computer: " + computerScore);

        // Close the scanner
        scanner.close();
    }
}
