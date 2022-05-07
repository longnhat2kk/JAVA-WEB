package bai_2_vong_lap_trong_java.bai_tap.hien_thi_cac_loai_hinh;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);

        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Printed right triangles, with right angles at the bottom left");
            System.out.println("2. Printed right triangle, with right angles on top left");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Draw the triangle");
                    System.out.println("Enter quantity * ");
                    int n = scanner.nextInt();

                    for (int i = 1; i <= n; i++) {//in chiều cao tam giác
                        for (int j = 1; j <= i; j++) { //in ra số dấu * mỗi dòng với số lượng = i
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }

                    break;
                case 2:
                    System.out.println("Printed right triangle, with right angles on top left");
                    System.out.println("Enter quantity * ");
                    int m = scanner.nextInt();

                    for (int i = m; i >= 1; --i) {
                        for (int j = 1; j <= i; ++j) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Draw the rectangle");
                    System.out.println("Enter the length of the rectangle");
                    int length = scanner.nextInt();
                    System.out.println("Enter the width of the rectangle");
                    int width = scanner.nextInt();

                    for (int i = 1; i <= width; i++) {
                        for (int j = 1; j <= length; j++) {
                            System.out.print("*  ");
                        }
                        System.out.println("");
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}

