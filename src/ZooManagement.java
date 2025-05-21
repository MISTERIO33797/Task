public class ZooManagement {
    public static void main(String[] args) {
        Animal lion = new Mammal("Lion", 5, true);
        Animal eagle = new Bird("Eagle", 3, true);
        Animal snake = new Reptile("Snake", 2, true);

        System.out.println("=== Animal Info ===");
        lion.displayInformation();
        ((Mammal) lion).nurseYoung();

        System.out.println("\n------------------\n");

        eagle.displayInformation();
        ((Bird) eagle).buildNest();

        System.out.println("\n------------------\n");

        snake.displayInformation();
        ((Reptile) snake).shedSkin();
    }
}
