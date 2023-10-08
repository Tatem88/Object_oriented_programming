package Lesson_1;


interface VendingMachine {
    HotDrinks getProduct(String name, int volume);
    HotDrinkWithTemperature getProduct(String name, int volume, int temperature);
}