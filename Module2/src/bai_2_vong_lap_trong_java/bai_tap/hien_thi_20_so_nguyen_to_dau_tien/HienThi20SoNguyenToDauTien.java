package bai_2_vong_lap_trong_java.bai_tap.hien_thi_20_so_nguyen_to_dau_tien;

import java.util.Scanner;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mời bạn nhập 1 số");
        int n = scanner.nextInt();

        int count = 0;
        int x = 2;

        while (true) {
            if (isNguyenTo(x)) {
                System.out.println(x + "");
                count++;
            }
            if (count == n) {
                break;
            }
            if (x == 2) {
                x++;
            } else {
                x += 2;
            }
        }
    }
    public static  boolean isNguyenTo(int n){
        for (int i=2; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }return true;
    }
}
