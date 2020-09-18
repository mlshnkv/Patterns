package patterns.Behavioral.Observer;

import patterns.Behavioral.Observer.Interfaces.DisplayElement;
import patterns.Behavioral.Observer.Interfaces.Observer;
import patterns.Behavioral.Observer.Interfaces.Subject;

public class StatisticDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject subject;

    public StatisticDisplay(Subject subject) {
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
        System.out.println("Statistic Display = " + temperature + ", current humidity =  " + humidity);
    }
}
