public class TopManager extends Company implements Employee{

    @Override
    public Integer getMonthSalary() {
        int generateMoneyEarned = (int) (Math.random() * (140_000 - 115_000) + 115_000);
        if (Company.INCOME >= 10_000_000) {
            generateMoneyEarned += generateMoneyEarned * 150 / 100;
        }
        return generateMoneyEarned;
    }

    public TopManager() {
        this.salary = getMonthSalary();
    }

    @Override
    public String toString() {
        return getSalary() + " руб.";
    }
}
