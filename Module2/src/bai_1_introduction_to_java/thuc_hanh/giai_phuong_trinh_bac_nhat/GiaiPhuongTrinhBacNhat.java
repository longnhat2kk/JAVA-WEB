package bai_1_introduction_to_java.thuc_hanh.giai_phuong_trinh_bac_nhat;

import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        //ax+b=0
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập a:");
        a = scanner.nextInt();
        System.out.println("Mời bạn nhập b: ");
        b = scanner.nextInt();

        if (a == 0){
            if (b == 0){
                System.out.println("Phương trình vô nghiệm");
            }else {
                System.out.println("Phương trình vô số nghiệm");
            }
        }else {
            float x = (float) -b / a;
            System.out.println("Phương trình có 1 nghiệm"+x);
            }


    }
}
