public class Trumpet implements IPlay {
    private int noValves;

    public Trumpet(int noValves) {
        this.noValves = noValves;
    }

    @Override
    public String play() {
        return "I'm the sound of a trumpet";
    }
}
