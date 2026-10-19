import java.util.Scanner;

public class Taskc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        boolean first = true;

        for (int i = a; i <= b; i++) {
            int sqrt = (int) Math.sqrt(i);
            if (sqrt * sqrt == i) {
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
