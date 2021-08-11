public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint() {
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] arr = new float[2];
        arr[0] = xSpeed;
        arr[1] = ySpeed;
        return arr;
    }

    @Override
    public String toString() {
        return "MovablePoint {" +
                " xSpeed = " + xSpeed +
                ", ySpeed = " + ySpeed +
                ", x = " + getX() +
                ", y = " + getY() +
                " }";
    }

    public MoveablePoint move() {
        MoveablePoint moveablePoint = new MoveablePoint(this.getXSpeed(), this.getYSpeed(), this.getX(), this.getY());
        moveablePoint.setX(this.getX() + this.xSpeed);
        moveablePoint.setY(this.getY() + this.ySpeed);
        return moveablePoint;
    }
}