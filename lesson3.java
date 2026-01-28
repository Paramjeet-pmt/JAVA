
// In this program we are making a simple calculator using the conditonal statement named switch in this we ask user to give 2 input a and b and at last ask which operation
// user want to perform 1 is mapped for add 2 for the difference 3 for the mutliple and 4 for the diff 
import java.util.*;

public class lesson3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number");
        int b = sc.nextInt();

        int var = sc.nextInt();

        switch (var) {
            case 1:
                int sum = a + b;
                System.out.println(sum);
                break;
            case 2:
                int diff = a - b;
                System.out.println(diff);
                break;
            case 3:
                int mutliple = a * b;
                System.out.println(mutliple);
                break;
            case 4:
                int divison = a / b;
                System.out.println(divison);
                break;
            case 5:
                int modulo = a % b;
                System.out.println(modulo);
                break;
            default:
                System.out.println("Invalid Respose ");
        }
    }
}
