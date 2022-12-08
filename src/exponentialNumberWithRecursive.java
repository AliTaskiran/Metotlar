import java.util.Scanner;

public class exponentialNumberWithRecursive {

    static double exp(int number, int exp) {
        if (exp > 0) {
            return number * exp(number, exp - 1);
        }
        return 1;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Base Value:");
        int base = input.nextInt();
        System.out.println("Enter the Exponential Value:");
        int exponential = input.nextInt();
        System.out.println(exp(base, exponential));
    }
}
