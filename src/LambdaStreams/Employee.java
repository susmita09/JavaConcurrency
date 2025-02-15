package LambdaStreams;

public class Employee{
    private int id;
    private String name;
    private String city;
    private int salary;
    private String department;

    public Employee(int id, String name, String city, int salary, String department) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.salary = salary;
        this.department = department;
    }

//    @Override
//    public int compareTo(Employee o) {
//        return this.id - o.id;  //assesding order of id
//    }

    public int getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public   String getCity() {
        return city;
    }

    public int getId() {
        return id;
    }
    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name='" + name + '\'' +
                ", city='" + city + '\'' + salary + ", department='" + department + '\'' + '}';
    }
}
