import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 01.09.15.
 */
public class Boolean031 {

// Даны целые числа a, b, c, являющиеся сторонами
// некоторого треугольника. Проверить истинность
// высказывания: «Треугольник со сторонами a, b, c
// является равнобедренным».

//  Равнобедренный треугольник — это треугольник,
//  в котором две стороны равны между собой по длине.

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

        if ((a == b) | (a == c) | (b == c)) {
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
        System.out.println("является равнобедренным : " + result);
    }
}