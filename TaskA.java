import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();

        for (long num = a; num <= b; num++) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        scanner.close();
    }
}
