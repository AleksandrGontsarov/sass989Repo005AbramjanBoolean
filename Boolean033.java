import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 02.09.15.
 */
public class Boolean033 {

// Даны целые числа a, b, c. Проверить истинность
// высказывания: «Существует треугольник со сторонами a, b, c».

    public static void main(String[] args) {

        System.out.println("Введите стороны треугольника.");
        Scanner s = new Scanner(System.in);
        System.out.print("Введите сторону А : ");
        int a = s.nextInt();
        System.out.print("Введите сторону B : ");
        int b = s.nextInt();
        System.out.print("Введите сторону C : ");
        int c = s.nextInt();

        boolean isTrue;

        if ((a + b) > c && (c + b) > a && (a + c) > b) {
            isTrue = true;
        }else isTrue = false;

        String result = null;
        String pravda = "Истина!";
        String nepravda = "Ложь!";

        if (isTrue == true) {
            result = pravda;
        } else result = nepravda;

        System.out.println();
        System.out.println("Проверим истинность высказывания : ");
        System.out.println("Существует треугольник со");
        System.out.println("сторонами : " + a + ", " + b + ", " + c + " : " + result);
    }
}