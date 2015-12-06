import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 15.08.15.
 */

// Дано четырехзначное число. Проверить истинность высказывания:
// «Данное число читается одинаково слева направо и справа налево».


public class Boolean023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввидите четырехназное число : ");
        int a = scanner.nextInt();
        System.out.println();

        int first = a % 10; // первый порядок
        int second = (a / 10) % 10; // второй порядок
        int third = (a / 100) % 10; // третий порядок
        int fourth = a / 1000; // четвертый порядок

        boolean isTrue;

        if (first == fourth && second == third) {
            isTrue = true;
        } else isTrue = false;

        String result = null;
        String pravda = "истина!";
        String nepravda = "ложь!";

        if (isTrue == true) {
            result = pravda;
        } else result = nepravda;

        System.out.println("Проверим истинность высказывания:");
        System.out.println();
        System.out.println("Данное число : ");
        System.out.println(fourth);
        System.out.println(third);
        System.out.println(second);
        System.out.println(first);
        System.out.println("Читается одинаково слева направо и справа налево : " + result);
    }
}