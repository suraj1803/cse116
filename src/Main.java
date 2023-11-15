import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();

        if (isLeapYear(year))
            System.out.println("Leap year");
        else
            System.out.println("Not Leap year");
    }

    public static boolean isLeapYear(int year) {
        if (year % 100 != 0 && year % 4 == 0)
            return true;
        else if (year % 100 == 0 && year % 400 == 0)
            return true;
        return false;
    }
}

