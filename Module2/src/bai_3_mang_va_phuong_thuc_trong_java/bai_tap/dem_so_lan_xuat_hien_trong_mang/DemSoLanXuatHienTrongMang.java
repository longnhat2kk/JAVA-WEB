package bai_3_mang_va_phuong_thuc_trong_java.bai_tap.dem_so_lan_xuat_hien_trong_mang;

import java.util.Scanner;

public class DemSoLanXuatHienTrongMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "Le Chu Long Nhat ";
        char value = 'L';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (value == str.charAt(i)) {
                count++;
            }
        }
        System.out.println("Số lượng ký tự " + value + " xuất hiện: " + count + " lần.");
    }
}
