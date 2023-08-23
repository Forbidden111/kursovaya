import java.util.Objects;

public class kursovaya {
    private static  long ID_COUNTER = 0;

    private long id;
    private String fullName;
    private int department;
    private double salary;

    public kursovaya(String fullName, int department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = ID_COUNTER++;
    }

    public long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        kursovaya kursovaya = (kursovaya) o;
        return id == kursovaya.id && department == kursovaya.department && Double.compare(salary, kursovaya.salary) == 0 && Objects.equals(fullName, kursovaya.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullName, department, salary);
    }

    @Override
    public String toString() {
        return "kursovaya{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }
}

