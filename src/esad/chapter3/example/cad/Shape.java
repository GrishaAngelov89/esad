package esad.chapter3.example.cad;

/**
 * @author: grisha_angelov
 */

interface Shape2d {
    public void draw(Graphics graphics);
}

class Line implements Shape2d {
    @Override
    public void draw(Graphics graphics) {
        graphics.drawLine(new Point(), new Point());
    }
}

class Rectangle implements Shape2d {

    @Override
    public void draw(Graphics graphics) {
        graphics.drawLine(new Point(), new Point());
        graphics.drawLine(new Point(), new Point());
        graphics.drawLine(new Point(), new Point());
        graphics.drawLine(new Point(), new Point());
    }
}

class Circle implements Shape2d {

    @Override
    public void draw(Graphics graphics) {
        graphics.drawCircle(new Point(), 12);
    }
}

class CADApp {
    void drawShapes(Graphics graphics, Shape2d shapes[]) {
        for (Shape2d shape : shapes) {
            shape.draw(graphics);
        }
    }
}