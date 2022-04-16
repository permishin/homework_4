import java.util.*;

public class Company implements Comparable<Company>{

    protected Integer salary;
    List<Employee> companyList = new ArrayList<>();
    public static final Integer INCOME = 10_000_000;

    public Integer getSalary() {
        return salary;
    }

    public Company() {
    }

    @Override
    public int compareTo(Company o) {
        return salary.compareTo(o.getSalary());
    }

    public void hire(Employee o) {
        Employee instance = null;
            if(o.getClass().getName().equals("Manager")) {
                instance = new Manager();
            } else if (o.getClass().getName().equals("Operator")) {
                instance = new Operator();
            } else if (o.getClass().getName().equals("TopManager")) {
                instance = new TopManager();
            }
            companyList.add(instance);
    }

    public void hireAll(Integer countEmployee, Employee o) {
        for (int i = 0; i < countEmployee; i++) {
           hire(o);
        }
    }

    public void fire(Integer percentDismissal) {
        int countDismissal = companyList.size() * percentDismissal / 100;
        int countForMinus = countDismissal;
        while(true) {
            int randomStaff = (int) (Math.random() * (companyList.size() - 0) + 0);
            if (countForMinus > 0) {
                companyList.remove(randomStaff);
                countForMinus--;
            } else {
                break;
            }
        }
    }

    List<Employee> getTopSalaryStaff(int count) {
        Set<Employee> setList = new TreeSet<>();
        setList.addAll(companyList);
        List<Employee> sortedList = new ArrayList<>();
        for (Employee set : ((TreeSet<Employee>) setList).descendingSet()) {
            if (!(sortedList.size() >= count)) {
                sortedList.add(set);
            } else {
                break;
            }
        }
        return sortedList;
    }

    List<Employee> getLowestSalaryStaff(int count) {
        Set<Employee> setList = new TreeSet<>();
        setList.addAll(companyList);
        List<Employee> sortedList = new ArrayList<>();
        for (Employee set : setList) {
            if (!(sortedList.size() >= count)) {
                sortedList.add(set);
            } else {
                break;
            }
        }
        return sortedList;
    }
}
