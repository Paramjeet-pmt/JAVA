import java.util.*;
public class Function_for_finding_the_greatest_number{
    
    public static int findGreatestNumber(int a, int b) {

    if(a>b){
        return a;
    }
    else if( a < b){
        return b;
    }else{
        System.out.println("Both Numbers are equal");
        return a;
    }
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a :");
        int a = sc.nextInt();
        
        System.out.print("Enter b :");
        int b = sc.nextInt();

        int large = findGreatestNumber(a, b);

        System.out.println("Greatest Number is : "+ large);
    }


}