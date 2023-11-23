public class Calculator2 {
    public static void main(String[] args) {

        final double NET_PRICE = 9.99;
        final double VAT_RATE = 0.23;


        double grossValue = NET_PRICE * (1 + VAT_RATE);


        double totalValueExcludingVAT = grossValue * 10000;


        System.out.printf("Gross value of the product: %.2f\n", grossValue);
        System.out.printf("Total value for 10,000 products excluding VAT: %.2f\n", totalValueExcludingVAT);
    }
}
