package com.devblogs.component.figure;
  
public abstract class Figure {
    private String name;
  
    public Figure(String name) {
        this.name = name;
    }
  
    public String getName() {
        return this.name;
    }
  
    public abstract double square();
}
