public class Guitar implements IPlay{

    private int noStrings;

    public Guitar(int noStrings) {
        this.noStrings = noStrings;
    }

    @Override
    public String play() {
        return  "I'm the sound of a guitar";
    }

}
