package org.example;

import java.util.Scanner;

// Class representing a foot
class Foot {
    private FootShape footShape;

    public Foot(FootShape footShape) {
        this.footShape = footShape;
    }

    public void setFootShape(FootShape footShape) {
        this.footShape = footShape;
    }

    public void draw() {
        // Implementation for drawing a foot
        System.out.println("What to draw? 1. Ellipse, 2. Rectangle");

        // Read user input
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        // Delegate drawing to the selected shape
        if (choice == 1) {
            footShape.drawAsEllipse();
        } else if (choice == 2) {
            footShape.drawAsRectangle();
        } else {
            System.out.println("Invalid choice.");
        }
    }
}