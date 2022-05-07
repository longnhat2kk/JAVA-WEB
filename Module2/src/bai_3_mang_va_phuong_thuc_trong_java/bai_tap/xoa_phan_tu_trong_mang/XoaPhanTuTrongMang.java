package bai_3_mang_va_phuong_thuc_trong_java.bai_tap.xoa_phan_tu_trong_mang;

import java.util.Scanner;

public class XoaPhanTuTrongMang {
    public static void main(String[] args) {
        int [] array = {10, 4, 6, 7, 8, 6, 0, 0, 0,};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Trước khi xóa: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println(" Mời bạn nhập số vị trí cần xóa trong mảng");
        int x = scanner.nextInt();

        System.out.println();
        for (int i = x; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        System.out.println("Sau khi xóa: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}


