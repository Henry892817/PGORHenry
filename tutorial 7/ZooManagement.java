class Lion extends Animal {

    public Lion(String name, int age) {

        super(name, age);
    }

    @Override
    public String makeSound() {
        return "Roar";
    }

    @Override
    public String move() {
        return "Runs on land";
    }

    @Override
    public String naturalHabitat() {
        return "Savannah and grasslands";
    }

    public void hunt() {
        System.out.println(name + " is hunting.");

    }
}
class Penguin extends Animal {

    public Penguin(String name, int age) {
        super(name, age);
    }

    @Override
    public String makeSound() {
        return "Honk";
    }

    @Override
    public String move() {
        return "Swims and waddles";
    }

    @Override

    public String naturalHabitat() {
        return "Cold coastal regions";
    }

    public void swim() {
        System.out.println(name + " is swimming.");
    }
}

class Snake extends Animal {

    public Snake(String name, int age) {
        super(name, age);
    }

    @Override
    public String makeSound() {
        return "Hiss";
    }


    @Override
    public String move() {
        return "Slithers";
    }

    @Override
    public String naturalHabitat() {
        return "Forests and deserts";
    }

    public void shedSkin() {
        System.out.println(name + " is shedding its skin.");
    }
}

public class ZooManagement {
    public static void main(String[] args) {
        Animal lion = new Lion("james", 5);

        Animal penguin = new Penguin("Patrick", 3);
        Animal snake = new Snake("Slither", 2);

        Animal[] animals = {lion, penguin, snake};

        for (Animal animal : animals) {
            animal.displayInformation();
            System.out.println();
        }

        // Additional behavior specific to subclasses
        ((Lion) lion).hunt();
        ((Penguin) penguin).swim();
        ((Snake) snake).shedSkin();
    }
}
