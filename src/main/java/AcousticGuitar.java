public class AcousticGuitar extends Guitar implements ISell  {

    double buyPrice;
    double sellPrice;

    public AcousticGuitar(String material, String colour, InstrumentType type, int noStrings, double sellPrice, double buyPrice) {
        super(material, colour, type, noStrings);
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    @Override
    public double calculateMarkup() {
        return this.sellPrice - this.buyPrice;
    }
}
