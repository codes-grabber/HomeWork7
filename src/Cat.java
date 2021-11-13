public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat (String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plate plate) {
        if(plate.decreaseFood(appetite)) {
            satiety = true;
            System.out.println(this.name + " " + satiety);
        } else {
            plate.addFood(50);
            satiety = false; System.out.println(this.name + " " + satiety);
        }
    }
}
