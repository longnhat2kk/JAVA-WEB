package bai_3_mang_va_phuong_thuc_trong_java.bai_tap.tim_phan_tu_lon_nhat_trong_mang_2_chieu;

public class TimPhanTuLonNhatMang2Chieu {
    public static void main(String[] args) {
        int [][] array = {
                {5,4,8,2,9,},
                {8,4,6,2,7}
        };
        int max = array[0][0];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++){
                if (max < array[i][j]){
                    max = array[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
