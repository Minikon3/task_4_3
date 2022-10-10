import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        items[] itemss = {
                new DellPC(catalog.COMPUTERS, "Чёрный", 20000),
                new HPlaptop(catalog.LAPTOPS, "Белый", 35000),
                new iPhone(catalog.PHONES, "Красный", 60000),
                new iPad(catalog.TABLETS, "Чёрный", 70000),
                new headphone(catalog.HEADPHONES, "Синий", 12000),
                new mouse(catalog.MOUSES, "Коричневый", 6000),
                new keyboard(catalog.KEYBOARDS, "Чёрный", 12000),
        };
        System.out.println("====Вход в аккаунт====");
        System.out.print("Введите логин: ");
        Scanner sc = new Scanner(System.in);
        String login = sc.next();
        System.out.println();
        System.out.print("Введите пароль: ");
        String password = sc.next();
        System.out.println("Добро пожаловать!");
        System.out.println("Все предметы по категориями предоставленны ниже: ");
        iteminfo info = new iteminfo();
        info.gadgetInfo(itemss);
        info.devicesInfo(itemss);
        info.PCInfo(itemss);
        System.out.println("Добавить в корзину (0 для отмены) ");
        System.out.println("Мобильные устройства: 1-iPhone, 2-iPad");
        System.out.println("USB устройства: 3-Наушники, 4-Мышь, 5-Клавиатура");
        System.out.println("Компьютеры: 6-Настольный компьютер, 7-Ноутбук");
        items[] basket = new items[10];
        int counter = 1;
        while (true) {
            int choose = sc.nextInt();
            if (choose == 0)
                break;
            switch (choose) {
                case 1:
                    basket[counter] = itemss[2];
                    System.out.println("iPhone успешно добавлен");
                    counter++;
                    break;
                case 2:
                    basket[counter] = itemss[3];
                    counter++;
                    System.out.println("iPad успешно добавлен");
                    break;
                case 3:
                    basket[counter] = itemss[4];
                    System.out.println("Наушники успешно добавлены");
                    counter++;
                    break;
                case 4:
                    basket[counter] = itemss[5];
                    System.out.println("Мышь успешно добавлена");
                    counter++;
                    break;
                case 5:
                    basket[counter] = itemss[6];
                    System.out.println("Клавиатура успешно добавлена");
                    counter++;
                    break;
                case 6:
                    basket[counter] = itemss[0];
                    System.out.println("ПК успешно добавлен");
                    counter++;
                    break;
                case 7:
                    basket[counter] = itemss[1];
                    System.out.println("Ноутбук успешно добавлен");
                    counter++;
                    break;
            }
        }
        System.out.println("Вывод содержимого корзины: ");
        for (int i=0;i< basket.length;i++) {
            if (basket[i]==null)
                break;
            System.out.println(basket[i]);
        }
        System.out.println("Подтверждение покупки(1-да, 0-нет): ");
        int confirm = sc.nextInt();
        if (confirm==1)
            System.out.println("Куплено!");
        else if (confirm==0) {
            System.out.println("Отмена покупки");
        }
    }
}