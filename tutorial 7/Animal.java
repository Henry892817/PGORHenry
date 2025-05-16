public abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public abstract String makeSound();
    public abstract String move();
    public abstract String naturalHabitat();

    public void displayInformation() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Sound: " + makeSound());
        System.out.println("Movement: " + move());
        System.out.println("Habitat: " + naturalHabitat());
    }
}
