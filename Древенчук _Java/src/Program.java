import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        double a;
        double b;
        double SubResult, SumResult, MultiplicationResult, DivisionResult;

        Scanner input = new Scanner(System.in);

            // Получить (от пользователя) значения "a", "b"
            System.out.print("Введите значение a: ");
            a = input.nextDouble();
            System.out.print("Введите значение b: ");
            b = input.nextDouble();
            //сравнивает два числа и возвращает результат сравнения путем вывода
            // в консоль одного из вариантов: "a > b", "a < b" или "a = b"
            if (a > b)
                System.out.print("a > b");
            else if (a < b)
                System.out.print("a < b");
            else if (a == b)
                System.out.print("a = b");
            System.out.println();
            //совершает с числами операции сложения, вычитания, деления и умножения и
            // результат выводит в консоль.

            SubResult = a - b;
            SumResult = a + b;
            MultiplicationResult = a * b;
            DivisionResult = a / b;

            // Отобразить результаты вычислений
            System.out.println("Сумма равна " + SumResult);
            System.out.println("Вычитание равно " + SubResult);
            System.out.println("Умножение равно " + MultiplicationResult);
            System.out.println("Деление равно " + DivisionResult);
    }
}

