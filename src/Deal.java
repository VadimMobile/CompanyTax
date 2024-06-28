public class Deal {
    protected String Comment;
    protected int creditChange;
    protected int debitChange;

    public Deal(String comment, int creditChange, int debitChange){
        this.Comment = comment;
        this.creditChange = creditChange;
        this.debitChange = debitChange;
    }
}
