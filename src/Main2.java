import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp = scanner.nextInt();
        System.out.println("На улице " + temp + " градусов");
        if (temp < 5) {
            System.out.println("Надень шапку");
        }
        if (temp > 5) {
            System.out.println(", можно идти без шапки");
        }
    }
}
