public class Plate {
    private static int food;

    public Plate (int food) {
        this.food = food;
    }

    public boolean decreaseFood(int appetite){
        int foo = this.food - appetite;
        if (foo >= 0) {
            this.food -= appetite;
            return true;
        } return false;
    }
    public void Info() {
        System.out.println("plate " + food);
    }

    public void addFood(int addFood){
        this.food += addFood;
        System.out.println("Подложили " + addFood + " стало " + this.food);
    }


}
