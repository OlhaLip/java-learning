package lv.acodemy;
public class PezDispenserTest {
    public static void main(String[] args) {
        // Создаем объект PEZDispenser
        PEZDispenser dispenser = new PEZDispenser("Marvel Hero", "Red", "MARVEL", 20);

        // Проверяем текущий запас конфет
        System.out.println("Текущий запас конфет: " + dispenser.getCandyCount());

        // Получаем одну конфету
        dispenser.getCandy();

        // Получаем несколько конфет
        dispenser.getCandies(3);

        // Пытаемся получить больше конфет, чем есть
        dispenser.getCandies(18);

        // Загружаем одну конфету
        dispenser.loadCandy();

        // Загружаем несколько конфет
        dispenser.loadCandies(3);

        // Проверяем текущий запас конфет снова
        System.out.println("Текущий запас конфет (Marvel): " + dispenser.getCandyCount());

        // Пытаемся загрузить 0 конфет (ошибка)
        dispenser.loadCandies(0);

        // Создаем объект PEZDispenser с серией "MARIO"
        PEZDispenser dispenser2 = new PEZDispenser("Mario Character", "Green", "MARIO", 10);
        System.out.println("Текущий запас конфет (MARIO): " + dispenser2.getCandyCount());

        // Получаем одну конфету из диспенсера Mario
        dispenser2.getCandy();

        // Проверяем запас конфет в диспенсере Mario
        System.out.println("Текущий запас конфет (MARIO): " + dispenser2.getCandyCount());

    }
}
