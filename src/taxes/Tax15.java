package taxes;

public class Tax15 extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        int tax15 = (debit - credit) * 15 /100;
        if (tax15 >= 0) {
            return tax15;
        } else {
            return 0;
        }

    }
}
