import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 25.07.15.
 */
public class Boolean002 {

// Дано целое число A. Проверить истинность высказывания:
// «Число A является нечетным».

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Введите число А : ");
        int a = s.nextInt();

        boolean isTrue;
        int b = a % 2;

        if (b == 0) {
            isTrue = false;
        } else isTrue = true;

        System.out.println("Число A является нечетным : " + isTrue);
    }
}