import java.lang.String;
import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 30.08.15.
 */
public class Boolean029 {

// Даны числа x, y, x1, y1, x2, y2. Проверить истинность
// высказывания: «Точка с координатами (x, y) лежит внутри
// прямоугольника, левая верхняя вершина которого имеет
// координаты (x1, y1), правая нижняя — (x2, y2),
// а стороны параллельны координатным осям».

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Ввидите координаты двух противоположных вершин прямоугольника:");
        System.out.println();
        System.out.println("   ^                                      ");
        System.out.println("  y|                                      ");
        System.out.println("   |                                      ");
        System.out.println("   |                                      ");
        System.out.println(" y1|......B_______________ C              ");
        System.out.println("   |      |               |               ");
        System.out.println("   |      |               |               ");
        System.out.println("   |      |               |               ");
        System.out.println("   |      |               |               ");
        System.out.println(" y2|......|_______________|               ");
        System.out.println("   |      :A              :D              ");
        System.out.println("   |      :               :               ");
        System.out.println("   |      :               :               ");
        System.out.println("  -|--------------------------------->    ");
        System.out.println("   |      x1              x2        x     ");
        System.out.println("                                          ");

        Scanner s = new Scanner(System.in);

        System.out.print("Введите координату х1 точки B: ");
        int x1 = s.nextInt();
        System.out.print("Введите координату y1 точки B : ");
        int y1 = s.nextInt();
        System.out.println();
        System.out.print("Введите координату х2 точки D : ");
        int x2 = s.nextInt();
        System.out.print("Введите координату y2 точки D : ");
        int y2 = s.nextInt();
        System.out.println();
        System.out.print("Введите х : ");
        int x = s.nextInt();
        System.out.print("Введите y : ");
        int y = s.nextInt();

        boolean isTrue;

        if ((x >= x1 && x <= x2) && (y >= y2 && y <= y1)) {
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
        System.out.println("Точка с координатами (" + x + ", " + y + ") лежит ");
        System.out.println("внутри прямоугольника, левая верхняя вершина ");
        System.out.println("которого имеет координаты (" + x1 + ", " + y1 + "), ");
        System.out.println("правая нижняя — (" + x2 + ", " + y2 + "), а стороны ");
        System.out.println("параллельны координатным осям : " + result);
    }
}