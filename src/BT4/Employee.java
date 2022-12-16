package BT4;

public class Employee {
    int id;
    String firstName;
    String lastName;

    double salary;
    public Employee(int id, String firstName, String lastName, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        if(salary < 0){
            this.salary = 0;
        }else{
            this.salary = salary;
        }
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
            this.salary = salary;

    }


    double bonusSalary(){
        return this.salary*12 + (this.salary*10)/100;
    }

    public double totalSalary(){
        return (salary*12);
    }
    public void hienThiThongTin(){
        System.out.println("\t Name: "+firstName+"\t"+lastName);
        System.out.println("\t Salary in a year: "+totalSalary() + "\t Luong bonus\t" + bonusSalary());
    }
    public static void main(String[] args){
        Employee employee= new Employee(01,"Nam","Ho",1000);
        Employee employee1= new Employee(02,"Nam","Ho",-100);
        employee.hienThiThongTin();
        employee1.hienThiThongTin();
    }
}
