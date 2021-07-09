public class Employee {
    String fName;;
    String lName;
    String position;
    String pNumber;
    String email;
    float salary;
    int age;

    void personInfo (){
        System.out.println(fName +' ' + lName);
        System.out.println("Phone number: " + pNumber);
        System.out.println("Email: " + email);
        System.out.println("Position: " + position);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
    }

    public Employee(String fName, String lName, String position, String pNumber, String email, float salary, int age){
        this.fName = fName;
        this.lName = lName;
        this.position = position;
        this.pNumber = pNumber;
        this.email = email;
        this.salary = salary;
        this.age = age;
    }
}
