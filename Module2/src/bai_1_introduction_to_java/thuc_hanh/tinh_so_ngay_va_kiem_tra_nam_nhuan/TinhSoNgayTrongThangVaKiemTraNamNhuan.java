package bai_1_introduction_to_java.thuc_hanh.tinh_so_ngay_va_kiem_tra_nam_nhuan;

import java.util.Scanner;

public class TinhSoNgayTrongThangVaKiemTraNamNhuan {
    public static void main(String[] args) {
        int nam,thang;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mời bạn nhập tháng 1 - 12");
        thang = scanner.nextInt();
        System.out.println("Mời bạn nhập năm");
        nam = scanner.nextInt();

        switch (thang){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 12:
                System.out.println("Có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Có 30 ngày");
            break;
            case 2:
                if ((nam % 4==0 && nam %100 !=0 )|| (nam %400==0)){
                    System.out.println("Có 29 ngày");
                }else {
                    System.out.println("Có 29 ngày");
                }
                break;
            default:
                System.out.println("Nhập sai tháng hoặc năm");
                break;
        }
    }
}
