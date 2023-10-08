package Lesson_1;

public abstract class Product {
    private String name;
    int volume;


    public Product(String name, int volume) {
        this.name = name;
        this.volume = volume;

    }

    public Product(int name, int volume) {
    }

    public abstract void voice();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + volume +
                '}';
    }
}
