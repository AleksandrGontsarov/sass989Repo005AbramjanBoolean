import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 15.08.15.
 */

// Даны числа A, B, C (число A не равно 0). Рассмотрев
// дискриминант D = B^2 – 4*A*C, проверить истинность
// высказывания: «Квадратное уравнение A·x^2 + B·x + C = 0 имеет вещественные корни».

public class Boolean024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число A ≠ 0 : ");
        double a = scanner.nextDouble();
        System.out.print("Введите число B  : ");
        double b = scanner.nextDouble();
        System.out.print("Введите число С : ");
        double c = scanner.nextDouble();
        System.out.println();

        boolean isTrue;

        double d = b * b - 4 * a * c; // Дискриминант

        if (d >= 0) {
            isTrue = true;
        } else isTrue = false;

        double x1 = 0;
        double x2 = 0;

        String result = null;
        String result2 = null;
        String pravda = "Истина!";
        String nepravda = "Ложь!";
        String var1 = "Дискриминант D > 0, и уравнение имеет два корня : ";
        String var2 = "Дискриминант D = 0, и уравнение имеет один корень : ";
        String var3 = "Дискриминант D < 0, и уравнение не имеет корней.";

        if (isTrue == true) {
            result = pravda;
        } else result = nepravda;

        if (d > 0) {
            x1 = (-b - Math.sqrt(d))/(2*a);
            x2 = (-b + Math.sqrt(d))/(2*a);
            result2 = var1;
        } else if (d == 0) {
            x1 = x2 = -b / (2 * a);
            result2 = var2;
        } else if (d < 0) {
            result2 = var3;
        }

        System.out.println("Проверим истинность высказывания : ");
        System.out.println("Квадратное уравнение A·x^2 + B·x + C = 0");
        System.out.println("имеет вещественные корни : " + result);
        System.out.println(result2);
        if (d > 0) {
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (d == 0) {
            System.out.println("x = " + x1);
        } else if (d < 0) {
            System.out.println();
        }
    }
}