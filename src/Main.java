public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        int account = 500;
        int pay = 1400;
        int bonus;
        if (pay > 1000) {
            bonus = pay / 100;
        } else {
            bonus = 0;
        }
        int total = account + pay + bonus;
        System.out.println("Итого на счете: " + total);
        System.out.println("Количество бонусов: " + bonus);
    }
}