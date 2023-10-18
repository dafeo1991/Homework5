package Homework5.data;

public class Director extends Worker {

    String directorSalary;

    public Director(String name, String age, String workExperience, String maritalMtatus, String directorSalary) {
        super(name, age, workExperience, maritalMtatus);
        this.directorSalary = directorSalary;
    }

    public Director(String directorSalary) {
        this.directorSalary = directorSalary;
    }

    @Override
    public String toString() {
        return "Директор -> " +
                "зарплата директора - " + directorSalary + '\'' +
                ", имя - " + name + '\'' +
                ", возраст - " + age + '\'' +
                ", рабочий стаж - " + workExperience + '\'' +
                ", семейное положение - " + maritalMtatus;
    }
}
