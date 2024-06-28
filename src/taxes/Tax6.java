package taxes;

public class Tax6 extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
       int tax6 = debit * 6 / 100;
        return tax6;
    }
}
