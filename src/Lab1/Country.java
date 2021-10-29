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
    private String name, namestol;
    private int S, N, Nstol;
    private float P;

    public Country(String name, int S, int N) {
        setName(name);
        setS(S);
        setN(N);
    }
//для git


    public Country(String name, String namestol, int S, int N, int Nstol) {
        this(name,S,N);
        setNamestol(namestol);
        setNstol(Nstol);
    }



    //// get/set Name

    public String getName() {
        return name;
    }


    public void setName(String name) {
        if (name != null && !name.equals(""))
            this.name = name;
        else
            throw new IllegalArgumentException("Поле название страны не должно быть пустым");
    }


    // get/set  Namestol

    public String getNameStol() {
        return namestol;
    }

    public void setNamestol(String namestol) {
        if (namestol != null && !namestol.equals(""))
            this.namestol = namestol;
         else
            throw new IllegalArgumentException("Поле столица страны не должно быть пустым");
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
        if (Nstol <= 0)
            throw new IllegalArgumentException("Поле население столицы не должно быть пустым");
        this.Nstol = Nstol;
    }

    //  get/set P
    public float getP() {
        return P;
    }

    public void setP(float P) {
        if (P <= 0)
            throw new IllegalArgumentException("Поле плотность не должно быть пустым");
        this.P = P;
    }

    // Git for
    @Override
    public String toString() {
        P = N / (S);
        if (namestol != null)
            return "Название страны: " + name + " " + "Столица: " + namestol + " " + "Площадь: " + S + " кв.км" + " " + "Население: " + N + " чел." + " " + "Плотность : " + P + " чел.на кв.км";
        else if (namestol == null)
            return "Название страны: " + name + " " + "Площадь: " + S + " кв.км" + " " + "Население: " + N + " чел.";
        return null;
    }

    public void print() {
        P = N / (S);
        System.out.println(name + ":  Площадь = " + S + "; Население = " + N
                + "; Плотность населения = " + P + " чел");
        if (namestol != null)
            System.out.println("Столица - " + namestol
                    + " с населением - " + Nstol);
        System.out.println();
    }

    public static void printAll(Country[] countries) {
        for (Country c : countries)
            c.print();
    }

}


