package Lab1;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.reflect.Array;

import static java.lang.System.out;
import static java.lang.System.setOut;

public class Out {

    public static void main(String[] args) {
        System.out.println("1) Россия " + "2) Финляндия " + "3) Франция " + " 4) Андорра " + "5) Сингапур");
        System.out.println("Выберите номер страны, информацию о которой хотите узнать : ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        Country Russia = new Country("Russia", "Moscow", 17_100000, 146_000_000, 12_600_000);
        Country Finland = new Country("Finland", "Helsinki", 338_000, 5_500_000, 655_000);
        Country France = new Country("France", "Paris", 643_800, 67_800_000, 2_100_000);
        Country Singapore = new Country("Singapore", 725, 570000);
        Country Andorra = new Country("Andorra", "Andorra La Vella", 467_000, 85_400, 22_600);


        switch (num) {
            case 1:
                num = 1;
                for (int i = 0; i < 5; i++) {
                }
                System.out.println(Russia);
                break;
            case 2:
                num = 2;
                System.out.println(Finland);
                break;
            case 3:
                num = 3;
                System.out.println(France);
                break;
            case 4:
                num = 4;
                System.out.println(Singapore);
                break;
            case 5:
                num = 5;
                System.out.println(Andorra);
                break;

        }
    }
}


