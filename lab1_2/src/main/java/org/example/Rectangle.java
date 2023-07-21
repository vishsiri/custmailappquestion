package org.example;

class Rectangle implements FootShape {
    @Override
    public void drawAsEllipse() {
        // Implementation for drawing a rectangle as an ellipse
        System.out.println("Drawing the rectangle as an ellipse.");
    }

    @Override
    public void drawAsRectangle() {
        // Implementation for drawing the rectangle as a rectangle
        System.out.println("Drawing the rectangle as a rectangle.");
    }
}