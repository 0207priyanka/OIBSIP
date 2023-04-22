import java.util.Scanner;
public class noguess
{
    public static void main(String args[]) 
    {
        int attempt = 1;
        int userGuessNumber = 0;
        // generate a random number between 1 and 100

        int secretNumber = (int) (Math.random() * 99 + 1);  
        // create a scanner object to read user input  

        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to Guess Number Game \nYou Will Be Asked To Guess A Number To Win The Game \nYou have Maximum 5 Attemp Limit");
        do {
            System.out.print("Enter a guess number between 1 to 100\n");
            if(userInput.hasNextInt()) {
                userGuessNumber = userInput.nextInt();
                //Read user input and check if it is correct
                // if the user guesses correctly, print the congratulation message and exit the program

                if (userGuessNumber == secretNumber)
                {    
                    System.out.println("OOhhOO!, Your Number is Correct. You Win the Game!");
                    break;
                }
                else if (userGuessNumber < secretNumber)
                    System.out.println("Your Guess Number is Smaller.");
                else if (userGuessNumber > secretNumber)
                    System.out.println("Your Guess Number is Greater.");
                if(attempt == 5) {
                    System.out.println("You have exceeded the maximum attempt. Try Again");
                    break;
                }
                attempt++;
            }else {
                System.out.println("Enter a Valid Integer Number");
                break;
            }
        } while (userGuessNumber != secretNumber);
    }
}