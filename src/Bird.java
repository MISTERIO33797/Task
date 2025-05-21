public class Bird extends Animal {
    private boolean canFly;

    public Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }

    public boolean canFly() {
        return canFly;
    }

    public void buildNest() {
        System.out.println(name + " is building a nest.");
    }

    @Override
    public String makeSound() {
        return "Chirp!";
    }

    @Override
    public String move() {
        return canFly ? "Flies through the sky" : "Walks or swims";
    }

    @Override
    public String naturalHabitat() {
        return "Forests, mountains, or coasts";
    }
}
