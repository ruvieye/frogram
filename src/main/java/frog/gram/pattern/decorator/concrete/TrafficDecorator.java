package frog.gram.pattern.decorator.concrete;

import frog.gram.pattern.decorator.component.Display;
import frog.gram.pattern.decorator.component.DisplayDecorator;

/**
 * Created by heesu on 2017-03-06.
 */
public class TrafficDecorator extends DisplayDecorator {
    public TrafficDecorator(Display decoratedDisplay) {
        super(decoratedDisplay);
        System.out.println("(TrafficDecorator)");
    }

    public void draw() {
        super.draw();
        drawTraffic();
    }

    private void drawTraffic() {
        System.out.println("\tDraw the Traffic status");
    }


}
