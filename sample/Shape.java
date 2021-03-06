package sample;

import javafx.geometry.Bounds;
import javafx.scene.Node;

public abstract class Shape {

    protected Point origin;
    protected Drawing drawing;
    static int LEFT = 1;
    static int RIGHT = 2;
    static int UP = 3;
    static int DOWN = 4;

    protected Point topLeft, topRight, bottomLeft, bottomRight;

    public Shape(Drawing d, Point origin) {
        drawing = d;
        this.origin = origin;
    }

    public abstract void setOrigin(Point point);

    public abstract boolean isOn(Point point);

    public void computeBounds(){
        Bounds bounds = drawing.getLayoutBounds();

        topLeft =  new Point(bounds.getMinX(), bounds.getMinY());
        topRight = new Point(bounds.getMaxX(),  bounds.getMinY());
        bottomLeft =  new Point(bounds.getMinX(), bounds.getMaxY());
        bottomRight = new Point(bounds.getMaxX(),  bounds.getMaxY());
    }

    public abstract void update();

    public abstract Node getShape();

}