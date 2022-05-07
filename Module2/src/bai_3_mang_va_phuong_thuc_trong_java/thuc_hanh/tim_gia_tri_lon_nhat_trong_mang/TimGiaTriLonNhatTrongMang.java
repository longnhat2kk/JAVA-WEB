package bai_3_mang_va_phuong_thuc_trong_java.thuc_hanh.tim_gia_tri_lon_nhat_trong_mang;

import java.util.Scanner;

public class TimGiaTriLonNhatTrongMang {
    public static void main(String[] args) {
//        hai báo các biến, nhập và kiểm tra kích thước mảng
        int size;
        int [] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size: ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        }
        while (size > 20);
//         Nhập giá trị cho các phần tử của mảng
        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.println("Enter element"+(i+1)+ ":" );
            array[i] = scanner.nextInt();
            i++;

        }
//        In ra danh sách tài sản đã nhập
        System.out.println("Property list: ");
        for (int j = 0; j < array.length; j ++){
            System.out.println(array[j]+"\t");
        }
    }
}
