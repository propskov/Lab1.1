/*
name - название государства
namestol - столица государства
S - площадь
N - население
Nstol - население столицы
P - плотность населения
формула плотности населения "плотность = население / площадь"
 */

package Lab1;

public class Country {
    public static int length;
    private String name, namestol;
    private int S, N, Nstol, P;

    public Country(String name, String namestol, int S, int N, int Nstol) {
        this.name = name;
        this.namestol = namestol;
        this.S = S;
        this.N = N;
        this.Nstol = Nstol;
        this.P = P;
        P = N / S;
    }

    public Country(String name, int S, int N) {
        this.name = name;
        this.S = S;
        this.N = N;
        this.P = P;
        P = N / S;
    }

    public static void printAll(Country[] countries) {
    }

    // get/set Name

    public String getName() {
        return name;
    }


    public void setName() {
        if (name == null)
            throw new IllegalArgumentException("Поле название страны не должно быть пустым");
        this.name = name;
    }


    // get/set  Namestol

    public String getNameStol() {
        return namestol;
    }

    public void setstol(String stol) {
        this.namestol = namestol;
    }

    //  get/set S
    public int getS() {
        return S;
    }

    public void setS(int S) {
        if (S <= 0)
            throw new IllegalArgumentException("Поле площадь не должно быть пустым");
        this.S = S;
    }

    //  get/set N
    public int getN() {
        return N;
    }

    public void setN(int N) {
        if (N <= 0)
            throw new IllegalArgumentException("Поле неселение не должно быть пустым");
        this.N = N;
    }


    //  get/set Nstol
    public int getNstol() {
        return Nstol;
    }

    public void setNstol(int Nstol) {
        this.Nstol = Nstol;
    }

    //  get/set P
    public int getP() {
        return P;
    }

    public void setP(int P) {
        if (P <= 0)
            throw new IllegalArgumentException("Поле плотность не должно быть пустым");
        this.P = P;
    }

    @Override
    public String toString() {
        return "Название страны: " + name + " " + "Столица: " + namestol + " " + "Площадь: " + S + " " + "Население: " + N + " " + "Плотность :  " + P + " на кв.км";
    }
}


