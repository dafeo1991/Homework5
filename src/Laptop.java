import java.util.*;

public class Laptop {

   private String model;

    private String operatingSystem;

    private int processor;

    private int randomAccessMemory;

    private double diagonal;

    private double weight;

    private String colour;

public Laptop(){

}
    public Laptop(String model, String operatingSystem, int processor, int randomAccessMemory, double diagonal, double weight, String colour){
        this.model = model;
        this.operatingSystem = operatingSystem;
        this.processor = processor;
        this.randomAccessMemory = randomAccessMemory;
        this.diagonal = diagonal;
        this.weight = weight;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "\n Модель : " + model + "\n Операционная система : " + operatingSystem + "\n Процессор : " + processor + "\n Оперативная память : " + randomAccessMemory +
                "\n Диагональ : " + diagonal + "\n Вес : " + weight + "\n Цвет : " + colour;
    }


    public Set<Laptop> newFilter(Set<Laptop> set) {
        Scanner scan = new Scanner(System.in);
        Set<Laptop> setLaptop = new HashSet<>(set);

        System.out.println("Введите цифру, соответствующую необходимому критерию: \n 1 - Процессор, \n 2 - Оперативная память, \n 3 - Диагональ, \n 4 - Вес");
        String num = scan.nextLine();

        for (int i = 0; i < num.length(); i++) {
            if(1 == Character.getNumericValue(num.charAt(i))) {
                System.out.println("Введите минимальную частоту процессора в ГЦ");
                String minimumFrequency = scan.nextLine();
                int intMinimumFrequency = Integer.parseInt(minimumFrequency);
                for (Laptop temp : set) {
                    if (intMinimumFrequency > temp.processor){
                        setLaptop.remove(temp);
                    }
                }
                if (intMinimumFrequency >= 2401){
                    System.out.println("Такой товар не найден");
                }
            }

            if(2 == Character.getNumericValue(num.charAt(i))){
                System.out.println("Укажите минимальное количество оперативной памяти в Мб");
                String minimumMemory = scan.nextLine();
                int intMinimumMemory = Integer.parseInt(minimumMemory);
                for (Laptop temp : set) {
                    if (intMinimumMemory > temp.randomAccessMemory){
                        setLaptop.remove(temp);
                    }
                }
                if (intMinimumMemory >= 4097){
                    System.out.println("Такой товар не найден");
                }
            }

            if(3 == Character.getNumericValue(num.charAt(i))){
                System.out.println("Укажите минимальный размер диагонали");
                String minimumDiagonal = scan.nextLine();
                double doubleMinimumDiagonal = Double.parseDouble(minimumDiagonal);
                for (Laptop temp : set) {
                    if (doubleMinimumDiagonal > temp.diagonal){
                        setLaptop.remove(temp);
                    }
                }
                if (doubleMinimumDiagonal >= 21.6){
                    System.out.println("Такой товар не найден");
                }
            }

            if(4 == Character.getNumericValue(num.charAt(i))){
                System.out.println("Напишите желаемый вес ноутбука (минимальное значение)");
                String minimumWeight = scan.nextLine();
                double doubleMinimumWeight = Double.parseDouble(minimumWeight);
                for (Laptop temp : set) {
                    if (doubleMinimumWeight > temp.weight){
                        setLaptop.remove(temp);
                    }
                }
                if (doubleMinimumWeight >= 6.51){
                    System.out.println("Такой товар не найден");
                }
            }
        }
        return setLaptop;
    }


}
