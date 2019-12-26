package com.potaczalapawel.design_patterns.behavioral.visitor.example.shapes;

public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}
