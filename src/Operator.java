public class Operator extends Company implements Employee{

    @Override
    public Integer getMonthSalary() {
        return (int) (Math.random() * (140_000 - 115_000) + 115_000);
    }

    public Operator() {
        this.salary = getMonthSalary();
    }

    @Override
    public String toString() {
        return getSalary() + " руб.";
    }
}
