package frog.gram.pattern.decorator.concrete;

import frog.gram.pattern.decorator.component.Display;
import frog.gram.pattern.decorator.component.DisplayDecorator;

/**
 * Created by heesu on 2017-03-06.
 */
public class LaneDecorator extends DisplayDecorator {

    public LaneDecorator(Display decoratedDisplay) {
        super(decoratedDisplay);
        System.out.println("(LaneDecorator)");
    }

    public void draw() {
        super.draw();
        drawLane();
    }

    private void drawLane() {
        System.out.println("\tDraw the Lane");
    }
}
