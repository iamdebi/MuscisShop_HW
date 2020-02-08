public class Piano extends Instrument implements IPlay {
    private int noKeys;

    public Piano(String material, String colour, InstrumentType type, int noKeys) {
        super(material, colour, type);
        this.noKeys = noKeys;
    }

    @Override
    public String play() {
        return "I'm the sound of a piano";
    }

    public int getNoKeys() {
        return noKeys;
    }
}
