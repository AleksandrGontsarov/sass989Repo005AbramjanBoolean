import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 13.08.15.
 */

// Проверить истинность высказывания:
// «Среди трех данных целых чисел есть хотя бы одна пара взаимно противоположных».

//  Противоположное число n' по отношению к числу n — это число,
//  которое при сложении с n даёт ноль. А данное явление
//  называется взаимным уничтожением слагаемых. n+n'=0

public class Boolean019 {
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

        if (a == -b | a == -c | -a == b | -a == c | b == -c | -b == c) {
            isTrue = true;
        } else isTrue = false;

        String result = null;
        String pravda = "истина!";
        String nepravda = "ложь!";

        if (isTrue == true) {
            result = pravda;
        } else result = nepravda;

        System.out.println("Среди трех данных целых чисел есть хотя бы одна пара взаимно противоположных : " + result);
    }
}