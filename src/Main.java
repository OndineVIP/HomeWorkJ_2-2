public class Main {
    public static void main(String[] args) {

        int initialBalance = 100;
        int added = 1100;

        int bonus = added > 1000 ? added / 100 : 0;

        int FinalBalance = initialBalance + added + bonus;
        System.out.println("Итоговый баланс: " + FinalBalance);
        System.out.println("Бонус: " + bonus);
    }
}