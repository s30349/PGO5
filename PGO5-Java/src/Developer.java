import java.util.ArrayList;

class Developer extends Employee{

    private ArrayList<Technology>technologies= new ArrayList<>();
    public Developer(String imie, String nazwisko, String adres, String email, String pesel, int rokZatrudnienia) {
        super(imie, nazwisko, adres, email, pesel, rokZatrudnienia);
    }
    public void addTechnology(Technology technology){
        technologies.add(technology);
    }
    @Override
    public int calculateSalary() {
        int placaPodst=super.calculateSalary();
        int bonus=0;
        for (Technology technology : technologies){
            bonus += technology.getBonus();
        }
        return placaPodst + bonus;
    }
}
