public class Main {
    private final static kursovaya[] employees = new kursovaya[10];


    public static void main(String[] args) {
        employees[0] = new kursovaya("ivanov ivan", 1, 10_000);
        employees[1] = new kursovaya("ivanov igor", 2, 12_000);
        employees[2] = new kursovaya("ivanov andrey", 3, 16_000);
        employees[3] = new kursovaya("ivanov maksim", 4, 19_000);
        employees[4] = new kursovaya("ivanov vlad", 5, 23_000);
        employees[5] = new kursovaya("kostin kosty", 1, 54_000);
        employees[6] = new kursovaya("ibis dibir", 2, 67_000);
        employees[7] = new kursovaya("maikl djony", 3, 78_000);
        employees[8] = new kursovaya("idrisov alex", 4, 89_000);
        employees[9] = new kursovaya("krakenova megan", 5, 31_000);

        printAll();
        System.out.println(sum());
        System.out.println(min());
        System.out.println(max());
        System.out.println(avarage());
        prinAllNames();


    }

    private static void printAll() {
        for (kursovaya employee : employees) {
            System.out.println(employee);

        }
    }

    private static double sum() {
        double sum = 0.0;
        for (kursovaya employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    private  static kursovaya min(){
        kursovaya minKursovaya = null;
        for (kursovaya employee : employees){
            if (minKursovaya == null ||employee.getSalary()< minKursovaya.getSalary()) {
                minKursovaya = employee;
            }
        }
        return minKursovaya;
    }



    private  static kursovaya max(){
        kursovaya maxKursovaya = null;
        for (kursovaya employee : employees){
            if (maxKursovaya == null ||employee.getSalary() > maxKursovaya.getSalary()) {
                maxKursovaya = employee;
            }
        }
        return maxKursovaya;
    }

    private static double avarage(){
        return sum() / employees.length;
    }

    private static void  prinAllNames(){
        for (kursovaya employee : employees) {
            System.out.println(employee.getFullName());

        }
    }
}
