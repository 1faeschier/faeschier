package Tours;

import javafx.scene.shape.Circle;
import javafx.scene.transform.Rotate;

public class Position {
    private double x;
    private double y;
    private double radius;
    private double angle;

    public Position(double x, double y){
        this.x = x;
        this.y = y;
        //this.angle = angle;

    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distance(Position P1, Position P2){
        double P1X = Math.pow(P1.getX(), 2.0); double P2X = Math.pow(P2.getX(), 2.0); double P1Y = Math.pow(P1.getY(), 2.0); double P2Y = Math.pow(P2.getY(), 2.0);
        return Math.sqrt(Math.pow(P1X+P2X, 2.0)+Math.pow(P1Y+P2Y, 2.0));
    }
//    public void getBounds(){
//        return new Circle(x, y, double radius);
//    }
    //public Rotate rotate(double angle){
    //    rotate().setAngle(double angle);
    //    rotate().setPivotX(double x);
    //    rotate().setPivotY(double y);
    //}
}
