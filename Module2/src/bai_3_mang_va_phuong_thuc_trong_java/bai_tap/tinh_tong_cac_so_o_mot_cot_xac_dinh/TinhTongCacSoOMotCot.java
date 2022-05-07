package bai_3_mang_va_phuong_thuc_trong_java.bai_tap.tinh_tong_cac_so_o_mot_cot_xac_dinh;

import java.util.Scanner;

public class TinhTongCacSoOMotCot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Mời bạn nhập số hàng của mảng: ");
        int m = input.nextInt();
        System.out.print("Mời bạn nhập số cột của mảng: ");
        int n = input.nextInt();

        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Mời bạn nhấp phần tử cột thư " + i + " hàng thứ " + j + ": ");
                arr[i][j] = input.nextInt();
            }
        }
        System.out.print("Mời bạn nhập cột cần tính tổng: ");
        int index = input.nextInt();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i][index + 1];
            System.out.println(arr[i][index - 1]);
        }
        System.out.println("Tổng cột là: " + sum);
    }
}