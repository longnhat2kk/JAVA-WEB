package bai_3_mang_va_phuong_thuc_trong_java.bai_tap.tim_gia_tri_nho_nhat_trong_mang;

import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        int[] array;
        int min;
        int size;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Mời bạn nhập size: ");
        size = scanner.nextInt();
        array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Mời bạn nhập phần tử " + i + ":");
            array[i] = scanner.nextInt();

        }
        min = array[0];
        for (int i = 0; i < size; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Phần tử nhỏ nhất trong mảng là: " + min);
    }
}
