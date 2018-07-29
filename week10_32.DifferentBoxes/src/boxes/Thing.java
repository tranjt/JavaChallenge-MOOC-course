package boxes;

public class Thing {

    private String name;
    private int weight;

    public Thing(String name, int weight) {
        if (weight < 0) {
            throw new IllegalArgumentException("Weight cannot be negative");
        }
        this.name = name;
        this.weight = weight;
    }

    public Thing(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public boolean equals(Thing other) {
        if (this.name.equals(other.name)) {
            return true;
        }
        return false;
    }

    public boolean equals(Object other) {
        if (other instanceof Thing) {
            Thing otherThing = (Thing) other;
            return this.name.equals(otherThing.name);
        }
        return false;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

}
