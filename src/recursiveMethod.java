import java.util.Scanner;

public class recursiveMethod {
    static int number(int a, int b, int c) {

        if (a != 0 && a >= 0) {
            System.out.print("" + a + " ");
            c = a - 5;
            return number(a - 5, b, c);
        } else if (c != b) {
            System.out.print("" + c + " ");
            return number(a, b, c + 5);
        } else {
            System.out.print("" + b + " ");
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        number(number, number, 0);
    }
}
