package org.example;

public class Main {
    public static void main(String[] args) {
        // Creating an instance of the Foot class with an ellipse shape
        Foot foot = new Foot(new Ellipse());

        // Drawing the selected shape
        foot.draw();
    }
}