package bai_15_xu_ly_ngoai_le_debug.bai_tap.su_dung_lllegal_triangle_exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập canh a: ");
        int a = scanner.nextInt();
        System.out.println("Hãy nhập canh b: ");
        int b = scanner.nextInt();
        System.out.println("Hãy nhập canh c: ");
        int c = scanner.nextInt();
        CheckTriangle checkTriangle = new CheckTriangle();
        try {
            checkTriangle.checkTriangle(a, b, c);
            System.out.println("Day la ba canh cua 1 tam giac!3");
        } catch (IllegalTriangleException e){
            System.out.println(e.getMessage());
        }
    }
}
