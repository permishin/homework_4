public class Manager extends Company implements Employee{

    @Override
    public Integer getMonthSalary() {
        int generateMoneyEarned = (int) (Math.random() * (140_000 - 115_000) + 115_000);
        generateMoneyEarned += generateMoneyEarned * 5 / 100;
        return generateMoneyEarned;
    }

    public Manager() {
        this.salary = getMonthSalary();
    }

    @Override
    public String toString() {
        return getSalary() + " руб.";
    }
}
