import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int deliveryDistance = scanner.nextInt();
        if (deliveryDistance < 20) {
            System.out.println("Доставка займет " + 1 + " день");
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Доставка займет " + 2 + " дня");
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println("Доставка займет " + 3 + " дня");
        } else {
            System.out.println("Доставки нет");
        }
    }
}
