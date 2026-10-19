import java.util.Scanner;

class TaskS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int current = 1;
        int count = 0;

        for (int i = 0; i < n; i++) {
            System.out.print(current);
            if (i < n - 1) {
                System.out.print(" ");
            }
            count++;
            if (count == current) {
                current++;
                count = 0;
            }
        }
        scanner.close();
    }
}
