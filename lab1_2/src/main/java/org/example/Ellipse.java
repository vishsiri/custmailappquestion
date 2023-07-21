package org.example;

class Ellipse implements FootShape {
    @Override
    public void drawAsEllipse() {
        // Implementation for drawing the ellipse as an ellipse
        System.out.println("Drawing the ellipse as an ellipse.");
    }

    @Override
    public void drawAsRectangle() {
        // Implementation for drawing the ellipse as a rectangle
        System.out.println("Drawing the ellipse as a rectangle.");
    }
}