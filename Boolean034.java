import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 04.09.15.
 */

// Даны координаты поля шахматной доски x, y
// (целые числа, лежащие в диапазоне 1–8). Учитывая,
// что левое нижнее поле доски (1, 1) является черным,
// проверить истинность высказывания: «Данное поле является белым».

public class Boolean034 {
    public static void main(String[] args) {

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
        System.out.println("                                               ");

        Scanner s = new Scanner(System.in);
        System.out.println("Введите координату х : ");
        int x = s.nextInt();
        System.out.println("Введите координату y : ");
        int y = s.nextInt();
        int color = (x + y) % 2;

//        System.out.println(color);

        boolean isTrue;

        if (color != 0) {
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
        System.out.println("Данное поле c координатами : " + x + ", " + y);
        System.out.println("является белым : " + result);
    }
}