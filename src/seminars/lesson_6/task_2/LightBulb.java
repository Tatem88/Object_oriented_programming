package seminars.lesson_6.task_2;

//DIP
class LightBulb extends Equipment{
    public void turnOn() {
        // Включение лампочки
    }

    public void turnOff() {
        // Выключение лампочки
    }
}

class Switch {
    private Equipment equipment;
    private LightBulb lightBulb;

    public Switch() {
        this.lightBulb= new LightBulb();
    }

    public void operate() {
        // Работа с выключателем
        equipment.turnOn();
    }
}
