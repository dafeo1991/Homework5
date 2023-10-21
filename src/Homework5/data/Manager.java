package Homework5.data;

public class Manager extends Worker {
    String managerSalary;

    public Manager(String name, String age, String workExperience, String maritalMtatus, String managerSalary) {
        super(name, age, workExperience, maritalMtatus);
        this.managerSalary = managerSalary;
    }

    public Manager(String managerSalary) {
        this.managerSalary = managerSalary;
    }

    @Override
    public String toString() {
        return "Менеджер -> " +
                "зарплата менеджера - " + managerSalary + '\'' +
                ", имя - " + name + '\'' +
                ", возраст - " + age + '\'' +
                ", рабочий стаж - " + workExperience + '\'' +
                ", семейное положение - " + maritalMtatus;
    }
}
