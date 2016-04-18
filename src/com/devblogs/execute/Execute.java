package com.devblogs.execute;
 
import com.devblogs.component.Print;
import com.devblogs.component.figure.Circle;
import com.devblogs.component.figure.Rectangle;
 
public class Execute {
    public static void main(String [] args) {
        Print print = new Print();
        print.setFigure(new Circle("circle", 5));
        print.showSquare();
    }
}
