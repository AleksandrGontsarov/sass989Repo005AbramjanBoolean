import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 02.09.15.
 */
public class Boolean032 {

// Даны целые числа a, b, c, являющиеся сторонами некоторого
// треугольника. Проверить истинность высказывания:
// «Треугольник со сторонами a, b, c является прямоугольным».

// Обратная теорема Пифагора: Для всякой тройки
// положительных чисел a, b и c, такой, что a^2 + b^2 = c^2,
// существует прямоугольный треугольник с катетами a и b и гипотенузой c.

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

        if (c > a && c > b && c * c == a * a + b * b) {
            isTrue = true;
        } else if (a > b && a > c && a * a == c * c + b * b) {
            isTrue = true;
        } else if (b > a && b > c && b * b == c * c + a * a) {
            isTrue = true;
        } else isTrue = false;

        String result = null;
        String pravda = "Истина!";
        String nepravda = "Ложь!";

        if (isTrue == true) {
            result = pravda;
        } else result = nepravda;

        System.out.println();
        System.out.println("Проверим истинность высказывания : ");
        System.out.println("Треугольник со сторонами " + a + ", " + b + ", " + c);
        System.out.println("является прямоугольным : " + result);
    }
}