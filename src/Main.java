
public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println("Ежемесячный платеж - " + service.calculate(1_000_000, 9.99, 12));
        System.out.println("Ежемесячный платеж - " + service.calculate(1_000_000, 9.99, 24));
        System.out.println("Ежемесячный платеж - " + service.calculate(1_000_000, 9.99, 36));
        System.out.println("Ежемесячный платеж - " + service.calculate(2_000_000, 8.99, 24));

    }
}