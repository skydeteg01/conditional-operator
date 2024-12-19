import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int speed = scanner.nextInt();
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " то она превышена");
        } else {
            System.out.println("Если скорость " + speed + " то превышения скорости нет");
        }
    }
}
