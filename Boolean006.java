import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 01.08.15.
 */
public class Boolean006 {

// Даны три целых числа: A, B, C. Проверить истинность высказывания:
// «Справедливо двойное неравенство A < B < C».

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Ввидите число А : ");
        int a = s.nextInt();
        System.out.print("ВВидите число В : ");
        int b = s.nextInt();
        System.out.print("Ввидите число С : ");
        int c = s.nextInt();
        System.out.println();

        boolean isTrue;

        if (a <b && b<c) {
            isTrue = true;
        } else isTrue = false;

        System.out.println("Справедливо двойное неравенство A < B < C : " + isTrue);
    }
}