import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то он не может кататься на атракционе");
        } else if (age > 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то он может кататься только в сопроваждении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + age + ", то он может кататься без взрослых");
        }
    }
}
