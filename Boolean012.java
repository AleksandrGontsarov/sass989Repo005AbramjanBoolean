import java.util.Scanner;

/**
 * Created by Sass on 07.08.15.
 */
public class Boolean012 {

//  Даны три целых числа: A, B, C. Проверить истинность
// высказывания: «Каждое из чисел A, B, C положительное».

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Введите чило А : ");
        int a = s.nextInt();
        System.out.print("Введите число В : ");
        int b = s.nextInt();
        System.out.print("Введите число С : ");
        int c = s.nextInt();
        System.out.println();

//        int c = a % 2;
//        int d = b % 2;

        boolean isTrue;

        if (a > 0 && b > 0 && c > 0) {
            isTrue = true;
        } else isTrue = false;

        String pravda = "истина!";
        String nepravda = "ложь!";
        String result = null;

        if (isTrue == true) {
            result = pravda;
        } else if (isTrue == false) {
            result = nepravda;
        }

        System.out.println("Каждое из чисел A, B, C положительное : " + result);
    }
}