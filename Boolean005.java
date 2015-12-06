import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 01.08.15.
 */
public class Boolean005 {

// Даны два целых числа: A, B. Проверить истинность
// высказывания: «Справедливы неравенства A ≥ 0 или B < –2».

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Ввидите число А : ");
        int a = s.nextInt();
        System.out.print("ВВидите число В : ");
        int b = s.nextInt();
        System.out.println();

        boolean isTrue;

        if (a >= 0 && b < -2) {
            isTrue = true;
        } else isTrue = false;

        System.out.println("Справедливы неравенства A ≥ 0 или B < –2 : " + isTrue);


    }
}
