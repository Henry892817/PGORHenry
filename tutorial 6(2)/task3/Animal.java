public class Animal {
    static class animal {
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

    static class Lion extends animal {
        @Override
        public void makeNoise() {
            System.out.println("Lion roars.");
        }
    }

    static class Cat extends animal {
        @Override
        public void makeNoise() {
            System.out.println("Cat meows.");
        }
    }

    static class Wolf extends animal {
        @Override
        public void makeNoise() {
            System.out.println("Wolf howls.");
        }
    }

    static class Dog extends animal {
        @Override
        public void makeNoise() {
            System.out.println("Dog barks.");
        }
    }
}
