import java.util.Scanner;

public class recursiveAsal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println(isAsal(number, 2));
    }

    static boolean isAsal(int a, int b) {
        if (b == a) {
            return true;
        } else if (a % b == 0) {
            return false;
        }
        return isAsal(a, b + 1);
    }
}
