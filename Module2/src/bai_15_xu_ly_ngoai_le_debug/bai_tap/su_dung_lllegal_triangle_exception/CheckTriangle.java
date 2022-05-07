package bai_15_xu_ly_ngoai_le_debug.bai_tap.su_dung_lllegal_triangle_exception;

public class CheckTriangle {
    public void checkTriangle(int a, int b, int c) throws IllegalTriangleException{
        if(a+ b < c|| a+ c < b|| c+ b < a){
            throw new IllegalTriangleException("a, b va c khong phai ba canh cua tam giac!");
        }
        if(a< 0|| b< 0|| c< 0){
            throw new IllegalTriangleException("a, b va c khong phai ba canh cua tam giac!");
        }
    }
}
