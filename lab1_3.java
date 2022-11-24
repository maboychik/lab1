import java.util.Scanner;

public class lab1_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x: ");
        int num = scanner.nextInt();
        System.out.print("n: ");
        int degree = scanner.nextInt();
        int multiplier = num;
        if (degree == 0) {
            System.out.print(1);
        } else if (degree > 0) {
            for (int i = 1; i < degree; i++) {
                num = num * multiplier;

            }
            System.out.print(num);
        } else {
            int abs_degree = -degree;
            for (int i = 1; i < abs_degree; i++) {
                num = num * multiplier;
            }
            float float_num = 1 / (float)num;
            System.out.print(float_num);
        }
    }
}
