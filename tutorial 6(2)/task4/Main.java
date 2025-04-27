public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Cat cat = new Cat();
        Wolf wolf = new Wolf();
        Dog dog = new Dog();

        lion.makeNoise();
        lion.roam();

        cat.makeNoise();
        cat.roam();

        wolf.makeNoise();
        wolf.roam();

        dog.makeNoise();
        dog.roam();
    }
}