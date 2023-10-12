package Lesson_2;
import java.util.*;
public class Market implements MarketBehavior, QueueBehavior {
    List<Actor> actors = new LinkedList<>();
    Queue<Actor> actorsQueue = new ArrayDeque<>();



     @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " in the shop");
        actors.add(actor);
    }

    @Override
    public void releaseFromMarket(Actor actor) {
        actors.remove(actor);
        System.out.println(actor.getName() + " left the store");
    }


    @Override
    public void takeInQueue(Actor actor) {
        actorsQueue.add(actor);
        System.out.println(actor.getName() + " standing in line");
    }

    @Override
    public void takeOrder() {
        actorsQueue.peek().isTakeOrder();
        System.out.println(actorsQueue.peek().getName() + " received an order");
    }

    @Override
    public void giveOrder() {
        actorsQueue.peek().isMakeOrder();
        System.out.println(actorsQueue.peek().getName() + " placed an order");
    }

    @Override
    public void releaseFromQueue() {
        System.out.println(actorsQueue.peek().getName() + " left the line");
        actorsQueue.poll();
    }
    @Override
    public void update() {
        System.out.println("Store updated");
    }
}
