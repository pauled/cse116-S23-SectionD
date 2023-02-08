package week2;

public class Grade {
    public static String plusMinus(int grade){
        int ones=grade%10;
        if (ones>=8){
            return "+";
        } else if(ones>=3){
            return "";
        } else {
            return "-";
        }
    }
    public static String letter(int grade){
        int tens=grade/10;
        if (tens>=9){
            return "A";
        } else if (tens>=8){
            return "B";
        } else if (tens>=7){
            return "C";
        } else if (tens>=6){
            return "D";
        } else {
            return "F";
        }

    }
}
