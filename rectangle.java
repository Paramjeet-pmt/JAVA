import java.util.*;;

public class rectangle {
    public static void main(String[] args) {

        System.out.println("Enter the number of rows");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

         System.out.println("Enter the number of columns");
         int b = sc.nextInt();

         for(int i = 1; i<=b; i++){
        for(int k =1; k<=a; k++){
            System.out.print("*");
        }
        System.out.println();
         }

    }
}
