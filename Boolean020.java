import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 13.08.15.
 */

// Дано трехзначное число. Проверить истинность
// высказывания: «Все цифры данного числа различны».

public class Boolean020 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите трехзначноечисло А : ");
        int a = scanner.nextInt();
        System.out.println();

//        int first = a % 10;// первый порядок
//        int second = ((a % 100) - first) / 10; // второй порядок
//        int third = (a - a % 100) / 100; // третий порядок

        int first = a % 10;
        int second = (a / 10) % 10;
        int third = a / 100;

        boolean isTrue;

        if (third != second && third != first && second != first) {
            isTrue = true;
        } else isTrue = false;

        String result = null;
        String pravda = "истина!";
        String nepravda = "ложь!";

        if (isTrue == true) {
            result = pravda;
        } else result = nepravda;

        System.out.println("Все цифры данного числа : ");
        System.out.println(third);
        System.out.println(second);
        System.out.println(first);
        System.out.println("Различны : " + result);
    }
}