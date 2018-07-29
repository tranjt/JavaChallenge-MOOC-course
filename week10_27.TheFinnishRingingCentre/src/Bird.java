
public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }

    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }

    public boolean equals(Object otherBird) {
        Bird other = null;
        if (otherBird instanceof Bird) {
             other = (Bird)otherBird;
        }

        return this.latinName.equals(other.latinName) && this.ringingYear == other.ringingYear;

    }

    public int hashCode() {
        return this.latinName.hashCode() * this.ringingYear;
    }
}
