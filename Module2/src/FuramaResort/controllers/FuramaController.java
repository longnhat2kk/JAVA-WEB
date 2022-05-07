package FuramaResort.controllers;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Mời bạn chọn 1 - 6");
            int nhap = sc.nextInt();

            System.out.println("Menu");
            System.out.println("1: Employee Management");
            System.out.println("2: Customer Management");
            System.out.println("3: Facility Management");
            System.out.println("4: Booking Management");
            System.out.println("5: Promotion Management");
            System.out.println("6: Exit");
            System.out.println("================================");

            switch (nhap) {
                case 1:
                    System.out.println("1: Employee Management");

                    break;
                case 2:
                    System.out.println("2: Customer Management");
                    break;
                case 3:
                    System.out.println("3: Facility Management");
                    break;
                case 4:
                    System.out.println("4: Booking Management");
                    break;
                case 5:
                    System.out.println("5: Promotion Management");
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Mời bạn nhập lại...");
            }
        }
        while (true);
    }
}

