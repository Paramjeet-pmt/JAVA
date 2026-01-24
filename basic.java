public class basic {
        public static void main(String[] args) {

        // 1. VARIABLES AND DATA TYPES
        int age = 25; // Integer
        double salary = 50000.50; // Decimal number
        boolean isActive = true; // Boolean (true/false)
        char grade = 'A'; // Single character
        String name = "John Doe"; // String (text)

        // 2. OPERATORS
        int a = 10, b = 5;
        int sum = a + b; // Addition
        int diff = a - b; // Subtraction
        int product = a * b; // Multiplication
        int division = a / b; // Division
        int remainder = a % b; // Modulus

        // 3. COMPARISON OPERATORS
        boolean isGreater = a > b; // Greater than
        boolean isLess = a < b; // Less than
        boolean isEqual = a == b; // Equal to
        boolean isNotEqual = a != b; // Not equal

        // 4. LOGICAL OPERATORS
        boolean result1 = (a > b) && (b > 0); // AND
        boolean result2 = (a > b) || (b < 0); // OR
        boolean result3 = !(a == b); // NOT

        // 5. IF-ELSE STATEMENTS
        if (age > 18) {
            System.out.println("You are an adult");
        } else if (age == 18) {
            System.out.println("You just turned 18");
        } else {
            System.out.println("You are a minor");
        }

        // 6. SWITCH STATEMENT
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Other day");
        }

        // 7. FOR LOOP
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }

        // 8. WHILE LOOP
        int counter = 0;
        while (counter < 3) {
            System.out.println("Counter: " + counter);
            counter++;
        }

        // 9. DO-WHILE LOOP
        int num = 0;
        do {
            System.out.println("Number: " + num);
            num++;
        } while (num < 2);

        // 10. ARRAYS
        int[] numbers = { 1, 2, 3, 4, 5 };
        String[] fruits = { "Apple", "Banana", "Orange" };
        System.out.println("First number: " + numbers[0]);
        System.out.println("First fruit: " + fruits[0]);

        // 11. ENHANCED FOR LOOP (FOR-EACH)
        for (int num2 : numbers) {
            System.out.println(num2);
        }

        // 12. STRING OPERATIONS
        String str1 = "Hello";
        String str2 = "World";
        String concatenated = str1 + " " + str2;
        System.out.println(concatenated);
        System.out.println(str1.length()); // Length
        System.out.println(str1.toUpperCase()); // Convert to uppercase
        System.out.println(str1.toLowerCase()); // Convert to lowercase
        System.out.println(str1.charAt(0)); // Get character at index
        System.out.println(str1.substring(0, 3)); // Get substring

        // 13. METHODS
        int result = add(10, 20);
        System.out.println("Sum: " + result);

        greet("Alice");
    }

    // METHOD WITHOUT PARAMETERS
    public static void greet(String person) {
        System.out.println("Hello, " + person);
    }

    // METHOD WITH PARAMETERS AND RETURN VALUE
    public static int add(int x, int y) {
        return x + y;
    }

    // METHOD WITH MULTIPLE RETURN STATEMENTS
    public static String getGrade(int marks) {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else {
            return "C";
        }
    }
}
