package bai_1_introduction_to_java.thuc_hanh.s_hinh_chu_nhat;

import java.util.Scanner;

public class SuDungToanTuSHinhChuNhat {
    public static void main(String[] args) {
        float dai, rong;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập chiều dài: ");
        dai = scanner.nextFloat();

        System.out.println("Mời bạn nhập chiều rộng:");
        rong = scanner.nextFloat();

        float dientich = dai * rong;

        System.out.println("Diện tích hình chữ nhật là: "+dientich);

    }
}
