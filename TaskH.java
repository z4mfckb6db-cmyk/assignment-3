import java.util.Scanner;

class TaskH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        boolean first = true;

        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
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
