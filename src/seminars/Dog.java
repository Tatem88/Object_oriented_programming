package seminars;

import seminars.Animal;

public class Dog extends Animal {
    private String breed;
    @Override
    public void voice() {
        System.out.println("hello im a dog woof " +breed );

    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
