package bai_12_java_collection_framework.bai_tap.arraylist_linkedlist_trong_java_collection_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductManager {
    private ArrayList<Product> list = new ArrayList<>();

    public void nhap() {
        System.out.println("nhập danh sách sản phẩm: ");
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        do {
            System.out.println("tên sản phẩm thứ: " + i);
            String st = scanner.nextLine();

            if (st == null || st.equals("")) {
                break;
            }
            System.out.println("giá sản phẩm");
            double gia = scanner.nextDouble();

            list.add(new Product(st, gia));
            scanner.nextLine();
            i++;
        } while (true);
    }

    public void hienThi() {
        System.out.println("danh sách sản phẩm");
        System.out.println("Ten\t\t|Gia\t\t");
        for (Product product : list) {
            System.out.println(product.getTenSP() + "      |" + product.getGia());
        }
    }

    public void sapXep() {
        Collections.sort(list, (a, b) -> (int) (a.getGia() - b.getGia()));
        System.out.println("Danh sách sau khi sắp xếp");
        hienThi();
    }

    public void timKiem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm cần tìm và xoá");
        String ten = scanner.nextLine();
        Product found = null;

        for (Product product : list) {
            if (product.getTenSP().equals(ten)) {
                found = product;
                break;
            }
        }
        if (found != null) {
            list.remove(found);
            System.out.println("sản phẩm đã được xoá");
        }
        System.out.println("không tìm thấy sản phẩm");

    }

    public void menu() {
        do {
            System.out.println("Menu");
            System.out.println("1: Nhập danh sách");
            System.out.println("2: Xuất dánh sách");
            System.out.println("3: Sắp xếp");
            System.out.println("4: Tìm kiếm và xoá");
            System.out.println("5: Thoát");
            System.out.println("Lựa chọn: ");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    nhap();
                    break;

                case 2:
                    hienThi();
                    break;

                case 3:
                    sapXep();
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
}

