import java.util.*;
public class FInding_odd_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number you want to check: ");
        int number = sc.nextInt();

        if(number % 2 == 0){
            System.out.println("The Number is even");
        }else{
            System.out.println("The Number is Odd");
        }
    }
}
