package bai_4_lop_va_doi_tuong_trong_java.thuc_hanh.hinh_chu_nhat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width:");
        int width = scanner.nextInt();
        System.out.print("Enter the height:");
        int height = scanner.nextInt();
        HinhChuNhat hcn = new HinhChuNhat(width, height);
        System.out.println("Your Rectangle \n" + hcn.display());
        System.out.println("Perimeter of the Rectangle: " + hcn.getPerimeter());
        System.out.println("Area of the Rectangle: " + hcn.getArea());
    }
}
