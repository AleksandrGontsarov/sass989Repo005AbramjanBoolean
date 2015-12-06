import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 16.08.15.
 */

// Даны числа x, y. Проверить истинность высказывания:
// «Точка с координатами (x, y) лежит во второй координатной четверти».

public class Boolean025 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите координату x : ");
        int x = scanner.nextInt();
        System.out.print("Введите координату y : ");
        int y = scanner.nextInt();
        System.out.println();

        boolean isTrue;

        if (x <= 0 && y >= 0) {
            isTrue = true;
        } else isTrue = false;

        String result = null;
        String result2 = null;
        String pravda = "Истина!";
        String nepravda = "Ложь!";
        String quarter1 = "I-ой координатной четверти.";
        String quarter2 = "II-ой координатной четверти.";
        String quarter3 = "III-ой координатной четверти.";
        String quarter4 = "IV-ой координатной четверти.";

        if (isTrue == true) {
            result = pravda;
        } else result = nepravda;

        if (x >= 0 && y >= 0) {
            result2 = quarter1;
        } else if (x <= 0 && y >= 0) {
            result2 = quarter2;
        } else if (x <= 0 && y <= 0) {
            result2 = quarter3;
        } else if (x >= 0 && y <= 0) {
            result2 = quarter4;
        }

        System.out.println("Проверим истинность высказывания : ");
        System.out.println("Точка с координатами (" + x + ", " + y + ")");
        System.out.println("лежит во второй координатной четверти : " + result);
        System.out.println();
        System.out.println("Действительно точка с координатами (" + x + ", " + y + ")");
        System.out.println("лежит в " + result2);
    }
}