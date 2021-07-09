public class HomeWork5 {
    public static void main(String[] args) {
        Employee[] emploArr = new Employee[5];
        emploArr[0] = new Employee("Ivan", "Ivanov", "manager", "8133213", "II@bk.com", 60000, 41);
        emploArr[1] = new Employee("Pasha", "Sidorov", "director", "981931285", "yadir@ya.ru", 230000, 25);
        emploArr[2] = new Employee("Larisa", "Pushkina", "assistant director", "9111388654", "larpuss@ya.ru", 120000, 31);
        emploArr[3] = new Employee("Tamara", "Mamaeva", "coordinator", "76590359", "mamaeva11@gmail.com", 90000, 29);
        emploArr[4] = new Employee("Andrei", "Gushin", "engineer", "9043218425", "mehanik99@ua.ru", 1900000, 51);
        System.out.println("С циклом For");
        for (int i = 0; i < emploArr.length; i++) {
            if (emploArr[i].age > 40) {
                emploArr[i].personInfo();
                System.out.println();
            }
        }

        int counter = 0;
        int requiredAge = 40;

        System.out.println("С циклом For each");
        for (Employee employee : emploArr) {
            if (employee.age < requiredAge) {
                counter++;
                System.out.println("Работник младше 40 лет номер " + counter);
                employee.personInfo();
                System.out.println();
            }
        }
    }
}


