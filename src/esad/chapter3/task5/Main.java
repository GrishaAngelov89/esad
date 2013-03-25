package esad.chapter3.task5;

/**
 * @author: grisha_angelov
 */
public class Main {
    public static void main(String[] args) {
        int amount = 100;
        System.out.println(new Currency(new Usd()).formatCurrency(amount));
        System.out.println(new Currency(new Euro()).formatCurrency(amount));
        System.out.println(new Currency(new Lev()).formatCurrency(amount));
    }
}
