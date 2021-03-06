/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Abstractfactorypattern;

import main.java.Abstractfactorypattern.AbstractFactory;
import main.java.Abstractfactorypattern.FactoryProducer;
import main.java.Abstractfactorypattern.Shape;

public class App {
    public static void main(String[] args) {
        
        // mendapatkan rounded shape factory 
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);

        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("SQUARE");
        
        shape2.draw();

        AbstractFactory shapeFactory2 = FactoryProducer.getFactory(true);

        Shape shape3 = shapeFactory2.getShape("RECTANGLE");

        shape3.draw();

        Shape shape4 = shapeFactory2.getShape("SQUARE");

        shape4.draw();
    }
}
