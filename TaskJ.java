import java.util.Scanner;

class TaskJ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long sum = 0;

        for (int i = 0; i < 100; i++) {
            sum += scanner.nextInt();
        }

        System.out.println(sum);
        scanner.close();
    }
}
