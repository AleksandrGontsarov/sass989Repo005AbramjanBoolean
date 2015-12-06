import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 13.08.15.
 */

// Проверить истинность высказывания:
// «Среди трех данных целых чисел есть хотя бы одна пара совпадающих».

public class Boolean018 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число А : ");
        int a = scanner.nextInt();
        System.out.print("Введите целое число B : ");
        int b = scanner.nextInt();
        System.out.print("Введите целое число C : ");
        int c = scanner.nextInt();
        System.out.println();

        boolean isTrue;

        if (a == b | a == c | b == c) {
            isTrue = true;
        } else isTrue = false;

        String result = null;
        String pravda = "истина!";
        String nepravda = "ложь!";

        if (isTrue == true) {
            result = pravda;
        } else result = nepravda;

        System.out.println("Среди трех данных целых чисел есть хотя бы одна пара совпадающих : " + result);
    }
}