import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 26.07.15.
 */
public class Boolean003 {

//  Дано целое число A. Проверить истинность высказывания:
//  «Число A является четным».

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Ввидите число А : ");
        int a = s.nextInt();

        boolean isTrue;
        int b = a % 2;

        if (b == 0) {
            isTrue = true;
        } else isTrue = false;

        System.out.println("Число A является четным : " + isTrue);
    }
}