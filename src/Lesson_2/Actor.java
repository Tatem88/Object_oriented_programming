package Lesson_2;

public abstract class Actor implements ActorBehaviour {
    protected String name;
    protected boolean isMakeOrderStatus;
    protected boolean isTakeOrderStatus;

    abstract String getName();
}