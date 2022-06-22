package CreationalPatterns.AbstractFactory.Example2.componentB;

import CreationalPatterns.AbstractFactory.Example2.componentApp.IShape;

public class PolarCircle implements IShape {
    @Override
    public String draw() {
        return "Draw a PolarCircle";
    }
}