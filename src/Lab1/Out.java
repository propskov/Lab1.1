package Lab1;

import java.util.Scanner;

import static java.lang.System.out;


public class Out {
    public static void main(String[] args) {
        System.out.println("1) Россия " + "2) Финляндия " + "3) Франция " + " 4) Сингапур " + "5) Андорра" + "  6) я очень любознательный");
        System.out.println("Выберите номер страны, информацию о которой хотите узнать : ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        Country Russia = new Country("Russia", "Moscow", 17_100000, 146_000_000, 12_600_000);
        Country Finland = new Country("Finland", "Helsinki", 338_000, 5_500_000, 655_000);
        Country France = new Country("France", "Paris", 643_800, 67_800_000, 2_100_000);
        Country Andorra = new Country("Andorra", "Andorra La Vella", 467, 85_400, 22_600);
        Country Singapore = new Country("Singapore", 725, 5700000);


        switch (num) {
            case 1:
                num = 1;
                for (int i = 0; i < 7; i++) {
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
            case 6:
                num = 6;
                out.println(Russia);
                out.println(France);
                out.println(Finland);
                out.println(Andorra);
                out.println(Singapore);

        }
    }
}


