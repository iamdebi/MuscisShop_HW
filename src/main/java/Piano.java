public class Piano implements IPlay {
    private int noKeys;

    public Piano(int noKeys) {
        this.noKeys = noKeys;
    }

    @Override
    public String play() {
        return "I'm the sound of a pinao";
    }
}
