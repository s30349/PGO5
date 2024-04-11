import java.util.ArrayList;

class Manager extends Employee {
    private ArrayList<Goal>goals=new ArrayList<>();
    public Manager(String imie, String nazwisko, String adres, String email, String pesel, int rokZatrudnienia) {
        super(imie, nazwisko, adres, email, pesel, rokZatrudnienia);
    }
    public void addGoals(Goal goal){
        goals.add(goal);
    }
    @Override
    public int calculateSalary() {
        int placaPodst=super.calculateSalary();
        int bonus=0;
        for (Goal goal : goals){
          if (goal.osiagniecia()){
              bonus += goal.getBonus();
          }
        }
       return placaPodst + bonus;
    }
}
