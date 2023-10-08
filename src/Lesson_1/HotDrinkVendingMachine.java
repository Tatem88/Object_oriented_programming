package Lesson_1;

class HotDrinkVendingMachine implements VendingMachine{
        @Override
public HotDrinks getProduct(String name, int volume) {
        return new HotDrinks(name, volume);
        }

@Override
public HotDrinkWithTemperature getProduct(String name, int volume, int temperature) {
        return new HotDrinkWithTemperature(name, volume, temperature);
        }
        }
