package CatLady;

public class Cymric extends Cats{
    private double lengthFur;

    public Cymric(String name, double lengthFur) {
        super(name);
        this.lengthFur = lengthFur;
    }
    @Override
    public String toString() {
        return String.format("Cymric %s %.2f",getName(),lengthFur);
    }
}
