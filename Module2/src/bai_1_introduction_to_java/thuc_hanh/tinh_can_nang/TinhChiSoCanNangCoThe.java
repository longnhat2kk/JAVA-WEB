package bai_1_introduction_to_java.thuc_hanh.tinh_can_nang;

import java.util.Scanner;

public class TinhChiSoCanNangCoThe {
    public static void main(String[] args) {
        //bmi = weight / height2
        double height,weight,bmi;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mời bạn nhập chiều cao (cm)");
        height = scanner.nextDouble();
        System.out.println("Mời bạn nhập cân nặng (kg)");
        weight = scanner.nextDouble();
        bmi = weight / Math.pow(height, 2);
//        bmi = (weight*703) / (height * height);
        if (bmi < 18.5){
            System.out.println("Chỉ số BMI của bạn là "+bmi+": gầy");
        }
       else if (bmi <25.0){
            System.out.println("Chỉ số BMI của bạn là "+bmi+": bình thường");
        }
       else if (bmi < 30.0){
            System.out.println("Chỉ số BMI của bạn là "+bmi+": thừa cân");
        }
       else {
            System.out.println("Chỉ số BMI của bạn là "+bmi+": Béo quá rồi bạn ơi, đi hút mỡ đi :)");
        }
    }
}
