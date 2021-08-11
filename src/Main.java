public class Main {
    public static void main(String[] args) {
        Point point = new Point(1, 2);
        System.out.println(point);

        MoveablePoint moveablePoint = new MoveablePoint(point.getX(), point.getY(), 6, 7);
        moveablePoint = moveablePoint.move();
        System.out.println(moveablePoint);
    }
}