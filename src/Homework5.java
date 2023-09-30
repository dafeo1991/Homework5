public class Homework5 {
    public static void main(String[] args) {
        TelNumber telNumber = new TelNumber();
        telNumber.add("12345", "Дарья");
        telNumber.add("14725", "Мария");
        telNumber.add("96325", "Ольга");
        telNumber.add("14563", "Дарья");
        telNumber.add("98745", "Ольга");
        telNumber.add("12368", "Василий");
        telNumber.add("85236", "Ольга");

        System.out.println(telNumber.getAll());


    }
}
