package seminars.lesson_6;

//LSP
class Bird {
    public void fly() {
        // Реализация полета птицы
    }
}

class Ostrich extends Bird {
    public void fly() {
        throw new UnsupportedOperationException("Страус не умеет летать");
    }
}
