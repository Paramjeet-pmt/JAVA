import java.util.*;

public class numberGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randomNo = (int) (Math.random() * 100);

        while (true) {
            System.out.print("Guess the random no: ");
            try{
                int input = sc.nextInt();
                if (randomNo == input) {
                    System.out.println("You guess the right number ");
                    System.out.println("THE END");
                    break;
                } else if (randomNo > input) {
                    System.out.println("Guess the higher value");
                } else {
                    System.out.println("Guess the smaller value");
                }
            }catch(InputMismatchException e){
                System.out.println("Please enter a valid number!");
                sc.nextLine(); // Clear the invalid input from buffer
            }
        }
        sc.close();
    }
}
