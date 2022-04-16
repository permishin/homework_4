public class Main {

    public static void main(String[] args) {
        Company beeline = new Company();
        beeline.hireAll(180, new Operator());
        beeline.hireAll(80, new Manager());
        beeline.hireAll(10, new TopManager());
        System.out.println(beeline.getTopSalaryStaff(15));
        System.out.println(beeline.getLowestSalaryStaff(30));
        beeline.fire(50);
        System.out.println(beeline.getTopSalaryStaff(15));
        System.out.println(beeline.getLowestSalaryStaff(30));
    }
}
