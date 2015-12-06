import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 06.08.15.
 */
public class Boolean010 {

// Даны два целых числа: A, B. Проверить истинность
// высказывания:«Ровно одно из чисел A и B нечетное».

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Введите число А : ");
        int a = s.nextInt();
        System.out.print("Введите число B : ");
        int b = s.nextInt();
        System.out.println();

        boolean isTrue;
        int c = a % 2;
        int d = b % 2;

//        if (c != 0) {
//            isTrue = true;
//        } else isTrue = false;

        if ((c == 0 | d != 0) & (c != 0 | d == 0)) {
            isTrue = false;
        } else isTrue = true;

        System.out.println("Ровно одно из чисел A и B нечетное : " + isTrue);
    }
}