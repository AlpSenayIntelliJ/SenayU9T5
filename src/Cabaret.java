import java.util.ArrayList;

public class Cabaret {
    private String name;
    private ArrayList<Performer> performers;
    public Cabaret(String name) {
        this.name = name;
        performers = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public ArrayList<Performer> getPerformers() {
        return performers;
    }
    public boolean addPerformer(Performer performer) {
        if (performers.contains(performer)) {
            return false;
        } else {
            performers.add(performer);
            return true;
        }
    }
}
