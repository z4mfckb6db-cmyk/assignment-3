import java.util.Scanner;

class TaskP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        boolean first = true;

        for (int x = 0; x <= 1000; x++) {
            long result = (long) a * x * x * x + (long) b * x * x + (long) c * x + d;

            if (result == 0) {
                if (!first) {
                    System.out.print(" ");
                }
                System.out.print(x);
                first = false;
            }
        }

        scanner.close();
    }
}
