public class MainCreditCalculate {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int monthlyPaymentOneYaer = service.calculate(1_000_000_000, 1,9.99);
        System.out.println ("Ежемесячный платеж "  + monthlyPaymentOneYaer +  " рублей");


        int monthlyPaymentTwoYaer = service.calculate(1_000_000_000, 2,9.99);
        System.out.println ("Ежемесячный платеж "  + monthlyPaymentTwoYaer +  " рублей");


        int monthlyPaymentTreeYaer = service.calculate(1_000_000_000, 3,9.99);
        System.out.println ("Ежемесячный платеж "  + monthlyPaymentTreeYaer +  " рублей");

    }
}

