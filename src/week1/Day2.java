package week1;

public class Day2 {
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
    public static void squareMe(int num){
        for (int x=1; x<num; x++){
            System.out.println(x*x);
        }
    }

    public static void main(String[] args) {
        System.out.println(letter(98));
        System.out.println(letter(72));
        System.out.println(letter(6));

        double val=10;
        while (val>=1){
            System.out.println("val="+val);
            val/=2;
            System.out.println("-val="+val);
        }
        System.out.println("what "+1+1);

        String placeHolder="a";
        for (int x=0; x<5; x++){
            System.out.println(x);
            int y=0;
        }
        int y=0;

        while(y<10){
            System.out.println(y);
            y=y+1;
        }

        squareMe(5);
    }
}
