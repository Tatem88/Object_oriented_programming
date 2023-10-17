package seminars.Lesson_1;

import seminars.Lesson_1.Cat;
import seminars.Lesson_1.Dog;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("boris", 10);
        cat.setColor("black");
        cat.voice();

        Dog dog = new Dog("name", 7);
        dog.setBreed("german shepard");
        dog.voice();
    }
}
