public class Violin extends Instrument implements IPlay{

    private String level;

    public Violin(String material, String colour, InstrumentType type, String level) {
        super(material, colour, type);
        this.level = level;
    }

    @Override
    public String play() {
        return "I'm the sound of a Violin";
    }

    public String getLevel() {
        return this.level;
    }
}
