import java.time.Year;

 class Employee {

    private String imie;
    private String nazwisko;
    private String adres;
    private String email;
    private String pesel;
    private int rokZatrudnienia;

    public Employee(String imie, String nazwisko, String adres, String email, String pesel, int rokZatrudnienia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.email = email;
        this.pesel = pesel;
        this.rokZatrudnienia = rokZatrudnienia;
    }

    public int calculateSalary() {
        int placaPodst=3000;
        int lataPracy= 2024-rokZatrudnienia;
        return placaPodst + (lataPracy*1000);
    }

}


