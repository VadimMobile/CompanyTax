public class Sale extends Deal{

    public Sale(String vegetables, int price) {
        super(String.format("Продажа" + vegetables + " на " + price + " руб."),0, price);

    }
}
