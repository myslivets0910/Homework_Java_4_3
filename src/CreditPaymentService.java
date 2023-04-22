public class CreditPaymentService {
        public int calculate(int sumCredit, int years, double pctCredit){
            double monthlyPercent = pctCredit / 1200; // месячная процентная ставка (1200 = (12 * 100))
            int sumMonth = years * 12; // количество месяцев

            double monthlyPayment = sumCredit * monthlyPercent / (1 - Math.pow(1 + monthlyPercent, -sumMonth));

            int monthlyPaymentInt = (int) monthlyPayment;
            return monthlyPaymentInt;
        }
    }
