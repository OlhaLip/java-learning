package lv.acodemy;
public class PEZDispenser {

    // Поля класса
    private String name;
    private String color;
    private String series;
    private int candyCount;

    // Конструктор
    public PEZDispenser(String name, String color, String series, int candyCount) {
        this.name = name;
        this.color = color;
        this.series = series;
        this.candyCount = candyCount;
    }

    public PEZDispenser(int i) {
    }

    // Метод для получения одной конфеты
    public void getCandy() {
        if (candyCount > 0) {
            candyCount--;
            System.out.println("Вы получили одну конфету! Осталось " + candyCount + " конфет.");
        } else {
            System.out.println("Нет конфет для выдачи.");
        }
    }

    // Метод для получения нескольких конфет
    public void getCandies(int amount) {
        if (amount <= candyCount) {
            candyCount -= amount;
            System.out.println("Вы получили " + amount + " конфет! Осталось " + candyCount + " конфет(ы).");
        } else {
            System.out.println("Недостаточно конфет. Доступно только " + candyCount + " конфет.");
        }
    }

    // Метод для загрузки одной конфеты
    public void loadCandy() {
        candyCount++;
        System.out.println("Конфета добавлена! Сейчас в диспенсере " + candyCount + " конфет.");
    }

    // Метод для загрузки нескольких конфет
    public void loadCandies(int amount) {
        if (amount > 0) {
            candyCount += amount;
            System.out.println(amount + " конфет добавлены! Сейчас в диспенсере " + candyCount + " конфет.");
        } else {
            System.out.println("Количество конфет должно быть больше нуля.");
        }
    }

    // Метод для получения текущего количества конфет
    public int getCandyCount() {
        return candyCount;
    }

    // Геттеры для других полей (по необходимости)
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getSeries() {
        return series;
    }

    public void printStatus() {
    }
}
