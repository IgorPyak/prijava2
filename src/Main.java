public class Main {
    public static void main(String[] args) {

    int balance = 200;  // начальный баланс
    int put = 1800; // сумма пополнения счёта
    int bonus;           // сумма бонуса
    int sum = balance + put;   // итоговый баланс

    if (put > 1000) {
        bonus = put / 100;
        System.out.println(bonus + "P Сумма бонуса");
        System.out.println((sum + bonus) + "P Итоговый баланс");
    } else {
        bonus = 0;
        System.out.println(bonus + "P Сумма бонуса");
        System.out.println((sum + bonus) + "P Итоговый баланс");
    }


}
}
