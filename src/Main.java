//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        for (int year = 1904; year <= 2096; year = year + 4) {
            System.out.println("год явлляется вискокосным" + year);
        }
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }
        for (int i = 1; i < 1024; i = i * 2) {
            System.out.println(i);
        }
        int cash = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + cash;
            System.out.println("Месяц" + i + "сумма накоплений равна" + total + "рублей");
        }
        int cash1 = 29000;
        int total1 = 0;
        for (int i = 0; i < 12; i++) {
            total1 = total1 + total1 / 100;
            total1 = total1 + cash1;
            System.out.println("Месяц" + i + "Итого" + total1);
        }
        System.out.println(total1);
        for (int o = 1; o <= 10; o++) {
            int result = 2 * o;
            System.out.println("2 * " + o + " = " + result);
        }
    }
}