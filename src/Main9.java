import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year % 4 == 0 && year % 100 != 0 && year > 1584 || year % 400 == 0) {
            System.out.println("Год високосный!");
        }else {
            System.out.println("Не високосный");
        }
    }
}
