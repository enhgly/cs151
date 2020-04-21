import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;
import java.util.ArrayList;
import java.util.Iterator;

public class CompositeShape implements Shape {

    ArrayList<Shape> shapes = new ArrayList<Shape>();

    @Override
    public boolean contains(Point2D p) {
        for (Shape s : shapes) {
            if (s.contains(p)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean contains(Rectangle2D r) {
        for (Shape s : shapes) {
            if (s.contains(r)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean contains(double x, double y) {
        for (Shape s : shapes) {
            if (s.contains(x, y)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean contains(double x, double y, double w, double h) {
        for (Shape s : shapes) {
            if (s.contains(x, y, w, h)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Rectangle getBounds() {
        double x = shapes.get(0).getBounds().getMinX();
        double y = shapes.get(0).getBounds().getMinY();
        double w = shapes.get(0).getBounds().getWidth();
        double h = shapes.get(0).getBounds().getHeight();
        for (Shape s : shapes) {
            Rectangle temp = s.getBounds();
            if (x > temp.getMinX()) {
                x = temp.getMinX();
            } 
            if (y > temp.getMinY()){
                y = temp.getMinY();
            }
            if (w < temp.getWidth()) {
                w = temp.getWidth();
            } 
            if (h < temp.getHeight()){
                h = temp.getHeight();
            }
        }
        return new Rectangle((int)x, (int)y, (int)w, (int)h);
    }

    @Override
    public Rectangle2D getBounds2D() {
        double x = shapes.get(0).getBounds2D().getMinX();
        double y = shapes.get(0).getBounds2D().getMinY();
        double w = shapes.get(0).getBounds2D().getWidth();
        double h = shapes.get(0).getBounds2D().getHeight();
        for (Shape s : shapes) {
            Rectangle2D temp = s.getBounds2D();
            if (x > temp.getMinX()) {
                x = temp.getMinX();
            } 
            if (y > temp.getMinY()){
                y = temp.getMinY();
            }
            if (w < temp.getWidth()) {
                w = temp.getWidth();
            } 
            if (h < temp.getHeight()){
                h = temp.getHeight();
            }
        }
        return new Rectangle2D.Double(x, y, w, h);
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at) {
        return new PathIterator() {
            private PathIterator currentPathIterator;
            private Iterator<Shape> shapesIterator;
            private AffineTransform at;
            private double flatness;

            // Constructor for an anonymous class
            {
                shapesIterator = shapes.iterator();
                nextShape();
            }

            private void nextShape() {
                if (shapesIterator.hasNext()) {
                    currentPathIterator = shapesIterator.next().getPathIterator(at, flatness);
                } else {
                    currentPathIterator = null;
                }
            }

            @Override
            public int getWindingRule() {
                return WIND_NON_ZERO;
            }

            @Override
            public boolean isDone() {
                if (currentPathIterator == null)
                    return true;
                if (!currentPathIterator.isDone())
                    return false;
                nextShape();
                return isDone(); // using recursion here but you can just loop through it too
            }

            @Override
            public void next() {
                currentPathIterator.next();
            }

            @Override
            public int currentSegment(float[] coords) {
                return currentPathIterator.currentSegment(coords);
            }

            @Override
            public int currentSegment(double[] coords) {
                return currentPathIterator.currentSegment(coords);
            }
        };
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at, double flatness) {
        return new PathIterator() {
            private PathIterator currentPathIterator;
            private Iterator<Shape> shapesIterator;
            private AffineTransform at;
            private double flatness;

            // Constructor for an anonymous class
            {
                shapesIterator = shapes.iterator();
                nextShape();
            }

            private void nextShape() {
                if (shapesIterator.hasNext()) {
                    currentPathIterator = shapesIterator.next().getPathIterator(at, flatness);
                } else {
                    currentPathIterator = null;
                }
            }

            @Override
            public int getWindingRule() {
                return WIND_NON_ZERO;
            }

            @Override
            public boolean isDone() {
                if (currentPathIterator == null)
                    return true;
                if (!currentPathIterator.isDone())
                    return false;
                nextShape();
                return isDone(); // using recursion here but you can just loop through it too
            }

            @Override
            public void next() {
                currentPathIterator.next();
            }

            @Override
            public int currentSegment(float[] coords) {
                return currentPathIterator.currentSegment(coords);
            }

            @Override
            public int currentSegment(double[] coords) {
                return currentPathIterator.currentSegment(coords);
            }
        };
    }

    @Override
    public boolean intersects(Rectangle2D r) {
        for (Shape s : shapes) {
            if (s.intersects(r)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean intersects(double x, double y, double w, double h) {
        for (Shape s : shapes) {
            if (s.intersects(x, y, w, h)) {
                return true;
            }
        }
        return false;
    }

    public void add(Shape shape) {
        shapes.add(shape);
    }

}
