public class TestEmployee {
    public static void main(String[] args) {
        Employee e = new Employee("Sathvik", "19cs137", 50000, 2023);
        System.out.println("Name "+e.name);
        System.out.println("Insurance Number: "+e.getInsurnaceNumber());
        System.out.println("Salary: "+e.getSalary());
        e.setYear(2020);
        System.out.println("Year "+e.getYear());
    }
}
