import java.util.ArrayList;

public class Programista extends Employee{

    public ArrayList<String>technologies;
    public Programista(String imie, String nazwisko, String adres, String email, int pesel, int rokZatrudnienia,ArrayList<String>technologies) {
        super(imie, nazwisko, adres, email, pesel, rokZatrudnienia);
        this.technologies=technologies;
    }
}
