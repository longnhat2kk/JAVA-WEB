package bai_3_mang_va_phuong_thuc_trong_java.bai_tap.them_phan_tu_vao_mang;

import java.util.ArrayList;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] array = new int[10];
        array[0]=4;
        array[1]=6;
        array[2]=7;
        array[3]=8;


        Scanner scanner = new Scanner(System.in);
        System.out.println("");

        System.out.println("Trước khi chèn: ");
        for (int element : array) {
            System.out.print(element + " ");
        }

        System.out.println("\nMời bạn nhập số cần thêm: ");
        int x = scanner.nextInt();
        System.out.println("Mời bạn nhập vị trí cần thêm: ");
        int index = scanner.nextInt();

        System.out.println("===============================");
        if(index <1 || index >= (array.length-1)){
            System.out.println("Sai vi tri index");
        }else{
            for (int i = array.length-1; i > index; i--) {
                array[i] = array[i - 1];
            }
        }
        array[index] = x;
        System.out.println("Sau khi chèn: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
