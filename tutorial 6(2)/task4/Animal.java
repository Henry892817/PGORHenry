class Animal {
    public void sleep() {
        System.out.println("Animal is sleeping.");
    }

    public void makeNoise() {
        System.out.println("Animal makes a noise.");
    }

    public void roam() {
        System.out.println("Animal is roaming.");
    }
}

class Feline extends Animal {
    @Override
    public void roam() {
        System.out.println("Feline prowls gracefully.");
    }
}

class Canine extends Animal {
    @Override
    public void roam() {
        System.out.println("Canine roams in packs.");
    }
}


class Lion extends Feline {
    @Override
    public void makeNoise() {
        System.out.println("Lion roars.");
    }
}

class Cat extends Feline {
    @Override
    public void makeNoise() {
        System.out.println("Cat meows.");
    }
}

class Wolf extends Canine {
    @Override
    public void makeNoise() {
        System.out.println("Wolf howls.");
    }
}

class Dog extends Canine {
    @Override
    public void makeNoise() {
        System.out.println("Dog barks.");
    }
}
