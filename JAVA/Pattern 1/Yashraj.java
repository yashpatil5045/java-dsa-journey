import java.util.Scanner;

public class Yashraj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");// Print until n=n
            }
            System.out.println();// For New Line
        }

        sc.close();//Always close the Scanner
    }
}
