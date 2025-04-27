public class Main {
    public static void main(String[] args) {
        Animal.Lion lion = new Animal.Lion();
        Animal.Cat cat = new Animal.Cat();
        Animal.Wolf wolf = new Animal.Wolf();
        Animal.Dog dog = new Animal.Dog();

        lion.makeNoise();
        cat.makeNoise();
        wolf.makeNoise();
        dog.makeNoise();
    }
}