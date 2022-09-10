public class Employee extends Person{
    private int salary;
    private int year;
    private String insurnaceNumber;
    Employee(String name, String insuranceNumber, int salary, int year) {
        super(name);
        this.insurnaceNumber = insuranceNumber;
        this.salary = salary;
        this.year = year;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getInsurnaceNumber() {
        return insurnaceNumber;
    }

    public void setInsurnaceNumber(String insurnaceNumber) {
        this.insurnaceNumber = insurnaceNumber;
    }
}
