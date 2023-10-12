package Lesson_2;

public class Main {
    public static void main(String[] args) {

        Human hm_1 = new Human();
        Human hm_2 = new Human();
        Human hm_3 = new Human();
        hm_1.name = "Alex";
        hm_2.name = "Inga";
        hm_3.name = "Lia";

        Market market = new Market();
        market.acceptToMarket(hm_1);
        market.acceptToMarket(hm_2);
        market.acceptToMarket(hm_3);
        market.takeInQueue(hm_1);
        market.takeInQueue(hm_2);
        market.takeInQueue(hm_3);
        market.giveOrder();
        market.takeOrder();
        market.releaseFromQueue();
        market.releaseFromMarket(hm_1);
        market.giveOrder();
        market.takeOrder();
        market.releaseFromQueue();
        market.update();
    }
}