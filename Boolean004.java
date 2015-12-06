import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 01.08.15.
 */
public class Boolean004 {

// Даны два целых числа: A, B. Проверить истинность
// высказывания: «Справедливы неравенства A > 2 и B ≤ 3».

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Ввидите число А : ");
        int a = s.nextInt();
        System.out.print("ВВидите число В : ");
        int b = s.nextInt();
        System.out.println();

        boolean isTrue;

        if (a > 2 && b <= 3) {
            isTrue = true;
        } else isTrue = false;

        System.out.println("Справедливы неравенства A > 2 и B ≤ 3 : " + isTrue);

    }
}