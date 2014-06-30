package com.execute;
 
import com.component.Print;
import com.component.figure.Circle;
import com.component.figure.Rectangle;
 
public class Execute {
    public static void main(String [] args) {
        Print print = new Print();
        print.setFigure(new Circle("circle", 5));
        print.showSquare();
    }
}
