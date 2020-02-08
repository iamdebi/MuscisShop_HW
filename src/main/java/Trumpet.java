public class Trumpet extends Instrument implements IPlay {
    private int noValves;

    public Trumpet(String material, String colour, InstrumentType type, int noValves) {
        super(material, colour, type);
        this.noValves = noValves;
    }

    @Override
    public String play() {
        return "I'm the sound of a trumpet";
    }

    public int getNoValves() {
        return this.noValves;
    }
}
