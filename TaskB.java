import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        boolean first = true;
        for (int i = a; i <= b; i++) {
            if (i % d == c) {
                if (!first) {
                    System.out.print(" ");
                }
                System.out.print(i);
                first = false;
            }
        }
        scanner.close();
    }
}
