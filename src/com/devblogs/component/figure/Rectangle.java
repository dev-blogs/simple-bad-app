package com.devblogs.component.figure;
  
public class Rectangle extends Figure {
    private int width;
    private int height;
  
    public Rectangle(String name, int width, int height) {
        super(name);
        this.width = width;
        this.height = height;
    }
  
    @Override
    public double square() {
        return this.width*this.height;
    }
}
