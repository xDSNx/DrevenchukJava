import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String a;
        String b;
        System.out.print("Введите значение a: ");
        a = input.nextLine();
        System.out.print("Введите значение b: ");
        b = input.nextLine();

        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }
}
