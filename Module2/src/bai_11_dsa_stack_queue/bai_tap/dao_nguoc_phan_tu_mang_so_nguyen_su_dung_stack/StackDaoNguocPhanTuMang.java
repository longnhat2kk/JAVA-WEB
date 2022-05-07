package bai_11_dsa_stack_queue.bai_tap.dao_nguoc_phan_tu_mang_so_nguyen_su_dung_stack;

import java.util.Scanner;
import java.util.Stack;

public class StackDaoNguocPhanTuMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack<Integer> myStack = new Stack<>();
        System.out.println("Mời bạn nhập Stack");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập số thứ " + i);
            myStack.push(scanner.nextInt());
        }
        System.out.println("Đảo ngược Stack: ");
        for (int i = 0; i < n; i++) {
            System.out.println(myStack.pop());
        }

    }
}
