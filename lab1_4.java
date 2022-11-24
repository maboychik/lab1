import java.util.Scanner;

public class lab1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Количество точек: ");
        int num = scanner.nextInt();
        System.out.print("Радиус окружности: ");
        int radius = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= num; i++) {
            System.out.print("X " + i + " точки: ");
            int x = scanner.nextInt();
            System.out.print("Y " + i + " точки: ");
            int y = scanner.nextInt();
            if (x * x + y * y <= radius * radius) {
                count++;
            }
        }
    System.out.print(count + " точек попали в окружность");
    }
}
