public class MainCreditCalculate {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int monthlyPayment1Yaer = service.calculate(1_000_000_000, 1,9.99);
        System.out.println ("Ежемесячный платеж "  + monthlyPaymentOneYaer +  " рублей");


        int monthlyPayment2Yaer = service.calculate(1_000_000_000, 2,9.99);
        System.out.println ("Ежемесячный платеж "  + monthlyPaymentTwoYaer +  " рублей");


        int monthlyPayment3Yaer = service.calculate(1_000_000_000, 3,9.99);
        System.out.println ("Ежемесячный платеж "  + monthlyPaymentTreeYaer +  " рублей");

    }
}

