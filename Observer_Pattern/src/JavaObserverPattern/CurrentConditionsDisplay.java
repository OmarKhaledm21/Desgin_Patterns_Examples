package JavaObserverPattern;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements DisplayElement, Observer{
    private float temperature;
    private float humidity;
    Observable observable;

    public CurrentConditionsDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver( this);
    }

    public void unsubscribe(){
        observable.deleteObserver(this);
    }

    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }

}
