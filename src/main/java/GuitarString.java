public class GuitarString implements ISell {

    double sellPrice;
    double buyPrice;
    String note;

    public GuitarString(double sellPrice, double buyPrice, String note) {
        this.sellPrice = sellPrice;
        this.buyPrice = buyPrice;
        this.note = note;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public double calculateMarkup() {
        return this.sellPrice - this.buyPrice;
    }
}
