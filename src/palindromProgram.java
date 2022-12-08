import java.util.Scanner;

public class palindromProgram {

    static boolean isPalindrom(int number) {
        int reverseNumber = 0, tempnumber = number;
        while (tempnumber != 0) {
            int a = tempnumber% 10;
            reverseNumber = (reverseNumber * 10) + a;
            tempnumber/= 10;
        }

        return reverseNumber == number;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        System.out.println(isPalindrom(number));
    }
}
