package Homework5.data;

public class Seller extends Worker{

    String sellerSalary;

    public Seller(String name, String age, String workExperience, String maritalMtatus, String sellerSalary) {
        super(name, age, workExperience, maritalMtatus);
        this.sellerSalary = sellerSalary;
    }

    public Seller(String sellerSalary) {
        this.sellerSalary = sellerSalary;
    }

    @Override
    public String toString() {
        return "Продавец -> " +
                "зарплата продавца - " + sellerSalary + '\'' +
                ", имя - " + name + '\'' +
                ", возраст - " + age + '\'' +
                ", рабочий стаж - " + workExperience + '\'' +
                ", семейное положение - " + maritalMtatus;
    }
}
