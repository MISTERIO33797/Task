public class Mammal extends Animal {
    private boolean isCarnivore;

    public Mammal(String name, int age, boolean isCarnivore) {
        super(name, age);
        this.isCarnivore = isCarnivore;
    }

    public boolean isCarnivore() {
        return isCarnivore;
    }

    public void nurseYoung() {
        System.out.println(name + " is nursing its young.");
    }

    @Override
    public String makeSound() {
        return "Roar!";
    }

    @Override
    public String move() {
        return "Runs on four legs";
    }

    @Override
    public String naturalHabitat() {
        return "Savannas or forests";
    }
}
