import java.util.Scanner;

class TaskG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int divisor = 2;

        while (x % divisor != 0) {
            divisor++;
        }

        System.out.println(divisor);
        scanner.close();
    }
}
