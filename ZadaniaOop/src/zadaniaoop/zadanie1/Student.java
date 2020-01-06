package zadaniaoop.zadanie1;

public class Student {
    private int nrIndeksu;
    private String imie;
    private String nazwisko;
    private char plec;

    public Student() {
    }

    public Student(int nrIndeksu, String imie, String nazwisko, char plec) {
        this.nrIndeksu = nrIndeksu;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.plec = plec;

    }

    public int getNrIndeksu() {
        return nrIndeksu;
    }

    public void setNrIndeksu(int nrIndeksu) {
        this.nrIndeksu = nrIndeksu;

    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public char getPlec() {
        return plec;
    }

    public void setPlec(char plec) {
        this.plec = plec;

    }

    public String przedstawSie() {
        return "Cześć, jestem " + imie +" "+ nazwisko +", jestem " + plec + " , mój nr indeksu to: " + nrIndeksu;
    }
}

