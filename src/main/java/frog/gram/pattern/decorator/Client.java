package frog.gram.pattern.decorator;

import frog.gram.pattern.decorator.component.Display;
import frog.gram.pattern.decorator.component.RoadDisplay;
import frog.gram.pattern.decorator.concrete.LaneDecorator;
import frog.gram.pattern.decorator.concrete.TrafficDecorator;

/**
 * Created by heesu on 2017-03-06.
 */
public class Client {
    public static void main(String args[]) {
        Display road = new RoadDisplay();
        road.draw();

        Display roadWithLane = new LaneDecorator(new RoadDisplay());
        roadWithLane.draw();

        Display roadWithTraffic = new TrafficDecorator(new RoadDisplay());
        roadWithTraffic.draw();

        System.out.println("------------------------------------");

//        Display roadWithLandWithTraffic = new TrafficDecorator(roadWithLane);
        Display roadWithLandWithTraffic = new TrafficDecorator(new LaneDecorator(new RoadDisplay()));
        roadWithLandWithTraffic.draw();
    }
}
