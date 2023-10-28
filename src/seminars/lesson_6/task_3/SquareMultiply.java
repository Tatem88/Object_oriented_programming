package seminars.lesson_6.task_3;

public class SquareMultiply extends Square{
    Square square;
    public double multiplySquare(Square square){
        return square.getSideA()+square.getSideB()+square.getSideC()+square.getSideD();
    }
}
