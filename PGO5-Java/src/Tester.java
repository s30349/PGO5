import java.util.ArrayList;

class Tester extends Employee {
    private ArrayList<String>testTypes=new ArrayList<>();
     public Tester(String imie, String nazwisko, String adres, String email, String pesel, int rokZatrudnienia) {
         super(imie, nazwisko, adres, email, pesel, rokZatrudnienia);
     }
     public void addTestType(String testType){
         testTypes.add(testType);
     }
    @Override
    public int calculateSalary() {
        return super.calculateSalary() + (testTypes.size() * 300);
    }
}
