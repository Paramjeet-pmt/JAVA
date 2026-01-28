import java.util.Scanner;

public class evennotilln {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n till where you want to print the even number ");
        int n = sc.nextInt();

        for(int i=0; i<=n; i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }
    }
}
