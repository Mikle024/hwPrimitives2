public class Main {

    public static void main(String[] args) {
        int initialBalance = 100;
        int rechargeAmount = 1100;
        int bonusLimit = 1000;

        int bonus;
        if (rechargeAmount > bonusLimit) {
            bonus = (rechargeAmount / 100);
        } else {
            bonus = 0;
        }
        int finalBalance = initialBalance + rechargeAmount + bonus;

        System.out.println("Итоговый счет: " + finalBalance);
        System.out.println("Количество начисленных бонусов: " + bonus);

    }
}