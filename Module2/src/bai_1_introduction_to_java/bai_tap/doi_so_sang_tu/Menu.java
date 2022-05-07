package bai_1_introduction_to_java.bai_tap.doi_so_sang_tu;

import java.util.Scanner;

public class Menu {
    private final static Scanner in = new Scanner(System.in);

    public static int checkInputIntLimit(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Out of ability");
                System.out.print("Enter again: ");
            }
        }
    }
    public String donvi(int a){
        String result =  "";
        switch (a){
            case 1:
                result ="One";
                break;
            case 2:
                result = "Two";
                break;
            case 3:
                result = "Three";
                break;
            case 4:
                result = "Four";
                break;
            case 5:
                result = "Five";
                break;
            case 6:
                result = "Six";
                break;
            case 7:
                result = "Seven";
                break;
            case 8:
                result = "Eight";
                break;
            case 9:
                result = "Nine";
                break;
        }
        return result;
    }
    public String muoiden20(int a){
        String result =  "";
        switch (a){
            case 10:
                result ="Ten";
                break;
            case 11:
                result ="Eleven";
                break;
            case 12:
                result = "Twelve";
                break;
            case 13:
                result = "Thirteen";
                break;
            case 14:
                result = "Fourteen";
                break;
            case 15:
                result = "Fifteen";
                break;
            case 16:
                result = "Sixteen";
                break;
            case 17:
                result = "Seventeen";
                break;
            case 18:
                result = "Eighteen";
                break;
            case 19:
                result = "Nineteen";
                break;
        }
        return result;
    }
    public String haimuoiden99(int a){
        String result =  "";
        int b = a/10;
        int c = a % 10;
        switch (b){
            case 2:
                result = "Twenty";
                break;
            case 3:
                result = "Thirty";
                break;
            case 4:
                result = "Fourty";
                break;
            case 5:
                result = "Fifty";
                break;
            case 6:
                result = "Sixty";
                break;
            case 7:
                result = "Seventy";
                break;
            case 8:
                result = "Eighty";
                break;
            case 9:
                result = "Ninety";
                break;
        }
        result = result + " " + donvi(c);
        return result;
    }
    public String hangtram(int a){
        String result =  "";
        int b = a/100;
        int c = a % 100;
        switch (b){
            case 1:
                result ="One hundred and ";
                break;
            case 2:
                result = "Two hundred and ";
                break;
            case 3:
                result = "Three hundred and ";
                break;
            case 4:
                result = "Four hundred and ";
                break;
            case 5:
                result = "Five hundred and ";
                break;
            case 6:
                result = "Six hundred and ";
                break;
            case 7:
                result = "Seven hundred and ";
                break;
            case 8:
                result = "Eight hundred and ";
                break;
            case 9:
                result = "Nine hundred and ";
                break;
        }
        if(c <20 && c>=10){
            result = result  + muoiden20(c);
        }else if(c<10){
            result = result  + donvi(c);
        }else if(c>=20){
            result = result  + haimuoiden99(c);
        }
        return result;
    }

}
