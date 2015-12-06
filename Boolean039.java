import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 06.09.15.
 */

// Даны координаты двух различных полей шахматной доски x1, y1, x2, y2
// (целые числа, лежащие в диапазоне 1–8). Проверить истинность
// высказывания: «Ферзь за один ход может перейти с одного поля на другое».

public class Boolean039 {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("  y                                            ");
        System.out.println("     _________________________________         ");
        System.out.println("  8  |   |⋰⋰|   |⋰⋰|   |⋰⋰|   |⋰⋰|         ");
        System.out.println("     |___|___|___|___|___|___|___|___|         ");
        System.out.println("  7  |⋰⋰|   |⋰⋰|   |⋰⋰|   |⋰⋰|   |         ");
        System.out.println("     |___|___|___|___|___|___|___|___|         ");
        System.out.println("  6  |   |⋰⋰|   |⋰⋰|   |⋰⋰|   |⋰⋰|         ");
        System.out.println("     |___|___|___|___|___|___|___|___|         ");
        System.out.println("  5  |⋰⋰|   |⋰⋰|   |⋰⋰|   |⋰⋰|   |         ");
        System.out.println("     |___|___|___|___|___|___|___|___|         ");
        System.out.println("  4  |   |⋰⋰|   |⋰⋰|   |⋰⋰|   |⋰⋰|         ");
        System.out.println("     |___|___|___|___|___|___|___|___|         ");
        System.out.println("  3  |⋰⋰|   |⋰⋰|   |⋰⋰|   |⋰⋰|   |         ");
        System.out.println("     |___|___|___|___|___|___|___|___|         ");
        System.out.println("  2  |   |⋰⋰|   |⋰⋰|   |⋰⋰|   |⋰⋰|         ");
        System.out.println("     |___|___|___|___|___|___|___|___|         ");
        System.out.println("  1  |⋰⋰|   |⋰⋰|   |⋰⋰|   |⋰⋰|   |         ");
        System.out.println("     |   |   |   |   |   |   |   |   |         ");
        System.out.println("     ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾         ");
        System.out.println("       1   2   3   4   5   6   7   8      X    ");
        System.out.println();

        Scanner s = new Scanner(System.in);
        System.out.print("Введите координату х1 : ");
        int x1 = s.nextInt();
        System.out.print("Введите координату y1 : ");
        int y1 = s.nextInt();
        System.out.println();
        System.out.print("Введите координату х2 : ");
        int x2 = s.nextInt();
        System.out.print("Введите координату y2 : ");
        int y2 = s.nextInt();
        System.out.println();

        int x3 = x1 - x2;
        int y3 = y1 - y2;
        int x;
        int y;

        if (x3 >= 0) {
            x = x3;         // приведение к модулю числа
        } else x = x3 * -1;   // приведение к модулю числа

        if (y3 >= 0) {
            y = y3;         // приведение к модулю числа
        } else y = y3 * -1;   // приведение к модулю числа

        boolean isTrue;

        if ((x == y) | ((x1 == x2) | (y1 == y2))) { // ферзь = ладья + слон
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
        System.out.println("Ферзь за один ход может перейти");
        System.out.println("с поля : " + x1 + ", " + y1);
        System.out.println("на поле : " + x2 + ", " + y2);
        System.out.println(result);
    }
}