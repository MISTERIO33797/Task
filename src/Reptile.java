public class Reptile extends Animal {
    private boolean isVenomous;

    public Reptile(String name, int age, boolean isVenomous) {
        super(name, age);
        this.isVenomous = isVenomous;
    }

    public boolean isVenomous() {
        return isVenomous;
    }

    public void shedSkin() {
        System.out.println(name + " is shedding its skin.");
    }

    @Override
    public String makeSound() {
        return "Hiss!";
    }

    @Override
    public String move() {
        return "Slithers or crawls";
    }

    @Override
    public String naturalHabitat() {
        return "Deserts, swamps, or rainforests";
    }
}
