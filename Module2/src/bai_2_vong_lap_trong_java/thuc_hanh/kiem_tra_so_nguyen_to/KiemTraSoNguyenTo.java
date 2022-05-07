package bai_2_vong_lap_trong_java.thuc_hanh.kiem_tra_so_nguyen_to;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mời bạn nhập vào 1 số");
        int number = scanner.nextInt();

        if (number <2) {
            System.out.println(number+" Không phải là số nguyên tố");

        }else{
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(number + " là 1 số nguyên tố");
            else
                System.out.println(number + " Không phải là số nguyên tố");
        }


    }
}
