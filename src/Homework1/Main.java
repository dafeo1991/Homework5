package Homework1;

public class Main {

    /**
     * Домашнее задание на закрепление:
     * <p>
     * 1)Создать класс Товар, имеющий переменные имя, цена, рейтинг.
     * 2)Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.
     * 3)Создать класс Basket, содержащий массив купленных товаров.
     * 4)Создать класс User, содержащий логин, пароль и объект класса Basket. Создать несколько объектов класса User.
     * 5)Вывести на консоль каталог продуктов. (все продукты магазина)
     * 6)Вывести на консоль покупки посетителей магазина. (После покупки у пользователя добавляется товар, а из магазина - удаляется)
     */


    public static void main(String[] args) {

        // todo создаем продукты

        Product meat = new Product("Мясо", 500, 4.9);

        Product milk = new Product("Молоко", 120, 3.7);

        Product bread = new Product("Хлеб", 45, 4.1);

        Product potato = new Product("Картошка", 50, 5.0);

        Product eggs = new Product("Яйца", 65);

        Product kefir = new Product("Кефир", 80, 2.6);

        // kefir.setRating(7);
        // milk.setPrice(1005);

        // todo Создаем категории

        Category animalOrigin = new Category("Животного происхождения", new Product[]{meat, milk, kefir, eggs});

        Category plantOrigin = new Category("Растительного происхождения", new Product[]{bread, potato});


        // todo Создаем корзины с покупками пользователей

        Basket basket1 = new Basket(new Product[]{meat, milk, bread});

        Basket basket2 = new Basket(new Product[]{potato});

        Basket basket3 = new Basket(new Product[]{eggs});

        //todo  Создаем пользователей

        User user1 = new User("Мария", "password1", basket1);

        User user2 = new User("Дарья", "password2", basket2);

        User user3 = new User("Василий", "password3", basket3);

        //todo Печатаем все продукты магазина

        System.out.println();
        System.out.println("Наш ассортимент:");
        System.out.println();

        //todo продукты жив происхождения выводим на экран

        for (Product product : animalOrigin.getProducts()) {


            System.out.println(product.getName() + " - " + product.getPrice() + " - " + product.getRating());


        }

        //todo  продукты растительного происхождения выводим на экран

        for (Product product : plantOrigin.getProducts()) {

            System.out.println(product.getName() + " - " + product.getPrice() + " - " + product.getRating());

        }

        //todo Печатаем покупки пользователей

        System.out.println();
        System.out.println("У нас сегодня купили: ");
        System.out.println();


        for (Product product : user1.getBasket().getSold()) {

            System.out.println(user1.getLogin() + " - " + product.getName());

        }


        for (Product product : user2.getBasket().getSold()) {

            System.out.println(user2.getLogin() + " - " + product.getName());

        }


        for (Product product : user3.getBasket().getSold()) {

            System.out.println(user3.getLogin() + " - " + product.getName());

        }

    }
}
