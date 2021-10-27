package Lab1;

public class Args {


    public static void main(String[] args) {
        Country[] countries = new Country[]{
                new Country("Russia", "Moscow", 17_100000, 146_000_000, 12_600_000),
                new Country("Finland", "Helsinki", 338_000, 5_500_000, 655_000),
                new Country("France", "Paris", 643_800, 67_800_000, 2_100_000),
                new Country("Singapore", 725, 570_000),
                new Country("Andorra", "Andorra La Vella", 467, 85_400, 22_600)
        };
        Country.printAll(countries);
    }
}
