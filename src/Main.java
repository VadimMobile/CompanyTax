import taxes.Tax15;
import taxes.Tax6;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("Овощебаза", new Tax6());
        System.out.println(company.applyDeals(new Deal[]{
                new Sale("Овощи", 20000),
                new Expediture("Овощи", 7500),
                new Sale("Овощи", 3000)
        }));

        company.setTaxSystem(new Tax15());
        System.out.println(company.applyDeals(new Deal[]{
                new Sale("Овощи", 20000),
                new Expediture("Овощи", 7500),
                new Sale("Овощи", 3000)
        }));
    }
}