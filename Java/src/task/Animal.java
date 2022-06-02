package task;

public abstract class Animal {

    public abstract void makeSound();
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("gau ..... gâu ....");
    }
}


class TestDog {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();
    }
}
