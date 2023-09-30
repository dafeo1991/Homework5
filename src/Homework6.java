import java.util.HashSet;
import java.util.Set;

public class Homework6 {

    public static void main(String[] args) {

        Laptop laptop1 = new Laptop("HP", "MS Windows 7 Professional (64-bit)", 2300,
                4096, 15.6, 2.610, "Серебристый");
        Laptop laptop2 = new Laptop("APPLE MACBOOK", "Mac OS X 10.6 (Snow Leopard)", 2400,
                2048, 13.3, 2.1, "Белый");
        Laptop laptop3 = new Laptop("Lenovo", "MS Windows 7 Home Basic (64-bit)", 2100,
                2048, 21.5, 6.5, "Белый");
        Laptop laptop4 = new Laptop("3Q ADROIT B1302N", "Без ОС", 1600, 1024,
                13.3, 1.8, "Черный");
        Laptop laptop5 = new Laptop("EMACHINES E644-E352G32MIKK", "MS Windows 7 Home Basic (64-bit)", 1600,
                2048, 15.6, 2.35, "Черный");

        Set<Laptop> set = new HashSet<>();
        set.add(laptop1);
        set.add(laptop2);
        set.add(laptop3);
        set.add(laptop4);
        set.add(laptop5);

        Laptop Filter = new Laptop();

        System.out.println(Filter.newFilter(set));
    }
}
