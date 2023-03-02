

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        Logger logger = Logger.getLogger();

        logger.log("Запуск программы");
        logger.log("Введите число от 1 до 30 для создания размера списка");

        Scanner in = new Scanner(System.in);

        int listLength = in.nextInt();
        if (listLength > 30) {
            logger.log("Исключение: ");
            throw new RuntimeException("Недопустимое число");
        } else {
            logger.log("Вы ввели : " + listLength);
        }

        logger.log("Введите верхнюю границу для значений, число не должно превышать 400");

        int maxValue = in.nextInt();
        if (maxValue > 400) {
            logger.log("Исключение: ");
            throw new RuntimeException("Недопустимое число");
        } else {
            logger.log("Вы ввели : " + maxValue);
        }

        logger.log("Создаем и наполняем список..");

        ArrayList<Integer> list = fillingTheList(listLength, maxValue);

        logger.log("Список создан: " + list);

        logger.log("Введите порог для фильтра, число не должно превышать 399");
        int filterFromUser = in.nextInt();
        if (filterFromUser > 399) {
            logger.log("Исключение: ");
            throw new RuntimeException("Недопустимое число");
        } else {
            logger.log("Вы ввели : " + filterFromUser);
        }

        Filter filter = new Filter(filterFromUser);

        List<Integer> listAfterFilter = filter.filterOut(list);

        logger.log("Прошло элементов : " + listAfterFilter.size() + " из : " + list.size());
        logger.log("Выводим результат на экран.....");
        logger.log("Отфильтрованный список : " + listAfterFilter);
        logger.log("Завершаем программу");
    }

    public static ArrayList<Integer> fillingTheList(int length, int maxValueFromUser) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            list.add(random.nextInt(maxValueFromUser));
        }
        return list;
    }
}