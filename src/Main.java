import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка ");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер списка: ");
        int n = scanner.nextInt();

        System.out.print("Введите верхнюю границу для значений: ");
        int m = scanner.nextInt();

        logger.log("Создаём и наполняем список");
        List<Integer> integerList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            integerList.add(random.nextInt(m));
        }
        System.out.println("Вот случайный список:" + integerList);

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        int f = scanner.nextInt();

        logger.log("Запускаем фильтрацию ");
        Filter filter = new Filter(f);
        List<Integer> result = filter.filterOut(integerList);

        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + result);

        logger.log("Завершаем программу");

    }
}
