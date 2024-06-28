public class Expediture extends Deal {

    public Expediture(String vegetables, int price) {
        super(String.format("Покупка " + vegetables +  " на " + + price +" руб."), price ,0);
    }
}
