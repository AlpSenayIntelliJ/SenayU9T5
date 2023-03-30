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

    public boolean removePerformer(Performer performer) {
        if (performers.contains(performer)) {
            performers.remove(performer);
            return true;
        } else {
            return false;
        }
    }

    public double averagePerformerAge() {
        double sum = 0.0;
        int count = 0;
        for (Performer p : performers) {
            sum += p.getAge();
            count++;
        }
        return sum/count;
    }

    public ArrayList<Performer> performersOverAge(int minAge) {
        ArrayList<Performer> arr = new ArrayList<>();
        for (Performer p : performers) {
            if (p.getAge() >= minAge) {
                arr.add(p);
            }
        }
        return arr;
    }

    public void groupRehearsal() {
        for (Performer p : performers) {
            System.out.println("REHEARSAL CALL! " + p.getName());
            if (p instanceof Comedian) {
                ((Comedian) p).rehearse(false);
            } else {
                p.rehearse();
            }
        }
    }

    public void cabaretShow() {
        for (Performer p : performers) {
            System.out.println("Welcome to the cabaret! Next act up... " + p.getName());
            if (p instanceof Dancer) {
                ((Dancer) p).pirouette(2);
                p.perform();
            } else {
                p.perform();
            }
        }
    }
}
