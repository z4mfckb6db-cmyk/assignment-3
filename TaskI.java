import java.util.Scanner;

class TaskI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int count = 0;

        for (int i = 1; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                if (i * i == x) {
                    count++;
                } else {
                    count += 2;
                }
            }
        }

        System.out.println(count);
        scanner.close();
    }
}
