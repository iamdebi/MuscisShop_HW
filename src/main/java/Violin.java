public class Violin implements IPlay{

    private String level;

    public Violin(String level) {
        this.level = level;
    }

    @Override
    public String play() {
        return "I'm the sound of a Violin";
    }
}
