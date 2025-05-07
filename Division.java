public class Division {

    public static void main(String[] args) {
        // Sample numbers
        double num1 = 10;
        double num2 = 2;

        // Perform division and print the result
        if (num2 != 0) {
            double result = num1 / num2;
            System.out.println("Division result: " + result);
        } else {
            System.out.println("Error: Cannot divide by zero");
        }
    }
}
