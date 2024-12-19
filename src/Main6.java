import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int places = scanner.nextInt();
        if (places < 60) {
            System.out.println("Сидячие места есть");
        } else if (places > 60 && places < 102) {
            System.out.println("Сидячих мест нет");
        } else {
            System.out.println("Мест нет");
        }
    }
}
