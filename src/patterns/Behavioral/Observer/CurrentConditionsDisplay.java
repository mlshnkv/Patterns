package patterns.Behavioral.Observer;

import patterns.Behavioral.Observer.Interfaces.DisplayElement;
import patterns.Behavioral.Observer.Interfaces.Observer;
import patterns.Behavioral.Observer.Interfaces.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject subject;

    public CurrentConditionsDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }


    @Override
    public void display() {
        System.out.println("Current condition = " + temperature + ", current humidity =  " + humidity);
    }
}
