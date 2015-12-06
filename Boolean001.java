import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 25.07.15.
 */
public class Boolean001 {

//   Дано целое число A. Проверить истинность высказывания:
//   «Число A является положительным».

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Введите число A : ");
        int a = s.nextInt();

        boolean isTrue;

        if (a >= 0) {
            isTrue = true;
        } else isTrue = false;

        System.out.println("Число A является положительным : " + isTrue);
    }
}