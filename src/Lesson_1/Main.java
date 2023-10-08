package Lesson_1;



public class Main {
    public static void main(String[] args) {

        HotDrinks tea = new HotDrinks("Tea", 250);
        HotDrinks coffee = new HotDrinks("Coffee", 350);
        HotDrinks cocoa = new HotDrinks("Cocoa", 200);

        HotDrinkVendingMachine vendingMachine = new HotDrinkVendingMachine();


        HotDrinks product1 = vendingMachine.getProduct("Tea", 250);
        System.out.println("product: " + product1.getName() + ", volume: " + product1.getVolume());

        HotDrinkWithTemperature product2 = vendingMachine.getProduct("Cocoa", 400, 70);
        System.out.println("product: " + product2.getName() + ", volume: " + product2.getVolume() +
                ", temperature: " + product2.getTemperature());

        HotDrinkWithTemperature product3 = vendingMachine.getProduct("Coffee", 300, 86);
        System.out.println("product: " + product3.getName() + ", volume: " + product3.getVolume() +
                ", temperature: " + product3.getTemperature());
    }
}
