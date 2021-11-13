public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Дуся", 60);
        Plate plate = new Plate(50);


        Cat cats[] = {
                new Cat("Дуся", 10),
                new Cat("Люся", 30),
                new Cat("Васька", 50),
                new Cat("Патриция", 49)
        };

        for (Cat animal : cats){
            animal.eat(plate);
            plate.Info();
        }
    }
}
