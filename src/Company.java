import taxes.TaxSystem;

public class Company {
    protected String title;
    protected int debit;
    protected int credit;
    protected TaxSystem taxSystem;

    public Company(String title, TaxSystem taxSystem) {
        this.title = title;
        this.taxSystem = taxSystem;
    }

    public void shiftMoney(int amount) {
        if (amount > 0) {
            debit += amount;
        } else {
            credit -= Math.abs(amount);
        }
    }

    public void setTaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }

    public void payTaxes() {
        int tax = taxSystem.calcTaxFor(debit, credit);
        System.out.println("Компания " + title + " уплатила налог в размере: " + tax + "руб.");
        debit = 0;
        credit = 0;
    }

    public int applyDeals(Deal[] deals) {
        for (Deal deal : deals) {
            if (deal.debitChange > 0) {
                shiftMoney(deal.debitChange);
            }
            if (deal.creditChange > 0) {
                shiftMoney(-deal.creditChange);
            }
        }
        int balance = debit - credit;
        payTaxes();
        return balance;
    }
}
