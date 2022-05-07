package thi_cuoi_module2.cua_hang_dien_thoai;

import bai_12_java_collection_framework.bai_tap.arraylist_linkedlist_trong_java_collection_framework.Product;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {

    private ArrayList<Product> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public void menu() {
        do {
            System.out.println("Menu");
            System.out.println("1: Nhập danh sách");
            System.out.println("2: Xuất dánh sách");
            System.out.println("3: Sắp xếp");
            System.out.println("4: Tìm kiếm và xoá");
            System.out.println("5: Thoát");
            System.out.println("Chọn chức năng: ");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    themMoi();
                    break;

                case 2:
                    xoa();
                    break;

                case 3:
                    xemDanhSachDienThoai();
                    break;

                case 4:
                    timKiem();
                    break;

                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Nhập sai giá trị");
            }

        }
        while (true);
    }
    public void themMoi() {
        int chon = scanner.nextInt();
        System.out.println("Chọn loại nhập điện thoại");
        switch (chon) {
            case 1:
                dienThoaiChinhHang();
                break;

            case 2:
                dienThoaiXachTay();
                break;
        }

    }

    private void dienThoaiChinhHang() throws FileNotFoundException {
        File file = new File("D:\\A0721I1-Le_Chu_Long_Nhat\\Module2\\src\\thi_cuoi_module2\\cua_hang_dien_thoai\\dien_thoai_chinh_hang");
        Scanner scanner = new Scanner(file);
    }

    private void dienThoaiXachTay() {

    }



    private void xemDanhSachDienThoai() {

    }

    private void xoa() {

    } private void timKiem() {

    }
}
