import java.util.Scanner;

class TaskN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int zeros = 0, positives = 0, negatives = 0;

        while (n-- > 0) {
            int num = scanner.nextInt();
            if (num == 0) zeros++;
            else if (num > 0) positives++;
            else negatives++;
        }

        System.out.println(zeros + " " + positives + " " + negatives);
        scanner.close();
    }
}
