package bai_3_mang_va_phuong_thuc_trong_java.bai_tap.gop_mang;

import java.util.Scanner;

public class GopMan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int[] array3 = new int[10];
        for (int i=0; i<array1.length; i++){
            System.out.print("Mời bạn nhập phần tử thứ "+i+" của mảng 1: ");
            array1[i] = input.nextInt();
            System.out.print("Mời bạn nhập phần tử thứ "+i+" của mảng 2: ");
            array2[i] = input.nextInt();
        }
        for (int i=0; i<5; i++){
            array3[i] = array1[i];
            array3[i+5] = array2[i];
        }
        System.out.println("Gộp mảng: ");
        for (int i : array3){
            System.out.print(i);
        }

    }
}

