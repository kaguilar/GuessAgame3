import java.util.Scanner;

public class GuessAgame3
{

      public static void main(String[] args) {

            int secretNumber;

            secretNumber = (int) (Math.random() * 99 + 1);           

            Scanner keyboard = new Scanner(System.in);

            int guess;

            do {

                  System.out.print("Enter a guess (1-99): ");

                  guess = keyboard.nextInt();

                  if (guess == secretNumber)

                        System.out.println("Your guess is correct. YAY!");

                  else if (guess < secretNumber)

                        System.out

                                   .println("Your guess is smaller :-( ");

                  else if (guess > secretNumber)

                        System.out

                                   .println("Your guess is greater :-0 ");

            } while (guess != secretNumber);

      }

}
