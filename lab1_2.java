import java.util.Scanner;

public class lab1_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("День: ");
        int day = scanner.nextInt();
        System.out.print("Месяц: ");
        int month = scanner.nextInt();
        if (1 <= day && day <= 31 && 1 <= month && month <= 12) {
            if (month == 1 || (day <= 29 && month == 2) || month == 12) {
                System.out.print("Зима");
            } else if (month == 3 || month == 5 || day <= 30 && month == 4) {
                System.out.print("Весна");
            } else if (month == 6 && day <= 30 || month == 7 || month == 8) {
                System.out.print("Лето");
            } else if (month == 9 && day <= 30 || month == 10 || month == 11 && day <= 30) {
                System.out.print("Осень");
            }

        } else {
            System.out.print("Введите корректные значения");
        }

    }
}
