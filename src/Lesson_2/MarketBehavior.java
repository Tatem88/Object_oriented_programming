package Lesson_2;

public interface MarketBehavior {
    void acceptToMarket(Actor actor);
    void takeInQueue(Actor actor);
    void takeOrder();
    void giveOrder();
    void releaseFromQueue();
    void update();
}