import java.util.Scanner;

/**
 * Created by Aleksandr Gontarov on 15.08.15.
 */

// Дано трехзначное число. Проверить истинность высказывания:
// «Цифры данного числа образуют возрастающую или
//  убывающую последовательность».

//  Возрастающая последовательность – если каждый следующий
//  элемент этой последовательности превышает предыдущий.

//  Убывающая последовательность - если каждый элемент
// этой последовательности превышает следующий за ним.

public class Boolean022 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите трехзначноечисло А : ");
        int a = scanner.nextInt();
        System.out.println();

//        int first = a % 10;// первый порядок
//        int second = ((a % 100) - first) / 10; // второй порядок
//        int third = (a - a % 100) / 100; // третий порядок

        int first = a % 10; // первый порядок
        int second = (a / 10) % 10; // второй порядок
        int third = a / 100; // третий порядок

        boolean isTrue;

        if ((third > second && second > first) | (third < second && second < first)) {
            isTrue = true;
        } else isTrue = false;

        String result = null;
        String pravda = "истина!";
        String nepravda = "ложь!";

        if (isTrue == true) {
            result = pravda;
        } else result = nepravda;

        System.out.println("Цифры данного числа : ");
        System.out.println(third);
        System.out.println(second);
        System.out.println(first);
        System.out.println("Образуют возрастающую или");
        System.out.println("убывающую последовательность : " + result);
    }
}