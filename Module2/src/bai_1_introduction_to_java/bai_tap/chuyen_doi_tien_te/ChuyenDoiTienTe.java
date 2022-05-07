package bai_1_introduction_to_java.bai_tap.chuyen_doi_tien_te;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd, chuyendoi;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Mời bạn nhập số tiền USD");
        usd = scanner.nextDouble();

        chuyendoi = usd * vnd;

        System.out.println("Số tiền VND là: "+ chuyendoi);



    }

}
