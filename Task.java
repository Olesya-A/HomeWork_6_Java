
/**
Создать класс Ноутбук для магазина техники.
Добавить атрибуты класса с соответствующими типами.
Например,
- идентификатор
- производитель
- название модели
- RAM
- объем HD
- операционная система
- цена
- и т.д.
Добавить конструктор класса.
Добавить необходимые методы класса.

Создать множество ноутбуков (множество объектов класса ноутбук).
3-10 штук

Вывести в консоль меню пользователя:
Добро пожаловать в каталог ноутбуков! 
Выберите действие:
  1 - Печать всех товаров
  2 - Поиск по каталогу
  0 - Выход
Написать метод, который будет запрашивать у пользователя критерий фильтрации (один) и выведет ноутбуки, отвечающие критерию.
Например:

Введите цифру, соответствующую критерию поиска:
1 - RAM
2 - Объем HD
3 - Операционная система
4 - Цвет …

Пример вывода:

Ноутбуки с цвет Серебристый
1 Honor ...
2..
3...
 */
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        Notebook notebook_1 = new Notebook(1, "MacBook Air 13", "Apple", 8, "256 ГБ", "MacOS", 78999);
        Notebook notebook_2 = new Notebook(2, "MateBook 14S", "HUAWEI", 16, "1 ТБ", "Windows", 110999);
        Notebook notebook_3 = new Notebook(3, "EliteBook 830 G8", "HP", 16, "512 ГБ", "Windows", 89999);

        HashSet<Notebook> nbSet = new HashSet<Notebook>();
        nbSet.add(notebook_1);
        nbSet.add(notebook_2);
        nbSet.add(notebook_3);

        System.out.println("Добро пожаловать в каталог ноутбуков! ");
        while (true) {
            System.out.println("Выберите действие:\n 1 - Печать всех товаров \n 2 - Поиск по каталогу \n 0 - Выход  ");
            Scanner iScanner = new Scanner(System.in, "cp866");
            int userInput = iScanner.nextInt();
            switch (userInput) {
                case 1:
                    for (Notebook nb : nbSet) {
                        System.out.println(nb.printNB());
                    }
                    break;
                case 2:
                    System.out.println(
                            "Введите цифру, соответствующую критерию поиска:\n 1 - производитель\n 2 - RAM\n 3 - Операционная система");
                    int userInput2 = iScanner.nextInt();
                    switch (userInput2) {
                        case 1:
                            System.out.println("Введите производителя - Apple, HUAWEI, HP: ");
                            String userInput3 = iScanner.next();
                            List<Notebook> queryManufact = notebook_1.findManufacturer(nbSet, userInput3);
                            for (Notebook nb : queryManufact) {
                                System.out.println(nb.printNB());
                            }
                            break;
                        case 2:
                            System.out.println("Введите объём RAM - 8/16: ");
                            int userInput4 = iScanner.nextInt();
                            List<Notebook> queryRAM = notebook_1.findRAM(nbSet, userInput4);
                            for (Notebook nb : queryRAM) {
                                System.out.println(nb.printNB());
                            }
                            break;
                        case 3:
                            System.out.println("Введите операционную систему - MacOS, Windows: ");
                            String userInput5 = iScanner.next();
                            List<Notebook> queryOS = notebook_1.findOS(nbSet, userInput5);
                            for (Notebook nb : queryOS) {
                                System.out.println(nb.printNB());
                            }
                            break;
                        default:
                            break;
                    }
                    break;
            }
            if (userInput == 0) {
                break;
            }

        }
    }
}