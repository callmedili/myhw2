public class BonusCalculator {
    public static void main(String[] args) {
        int initialBalance = 100;
        int recharge = 1100;

        int bonus = 0;
        if (recharge > 1000) {
            bonus = recharge / 100;
        }

        int finalBalance = initialBalance + recharge + bonus;

        System.out.println("Бонус: " + bonus + " руб.");
        System.out.println("Итоговая сумма на счёте: " + finalBalance + " руб.");
    }
}