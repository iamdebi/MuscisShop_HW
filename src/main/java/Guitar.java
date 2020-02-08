public class Guitar extends Instrument implements IPlay{

    private int noStrings;

    public Guitar(String material, String colour, InstrumentType type, int noStrings) {
        super(material, colour, type);
        this.noStrings = noStrings;
    }

    @Override
    public String play() {
        return  "I'm the sound of a guitar";
    }

    public int getNoStrings() {
        return noStrings;
    }
}
