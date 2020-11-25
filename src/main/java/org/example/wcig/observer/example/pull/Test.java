package org.example.wcig.observer.example.pull;

public class Test {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        weatherData.addObserver(new Student());
        weatherData.addObserver(new Teacher());
        weatherData.setState(1);
        weatherData.setState(2);
    }
}

// output:
// teacher receive update:WeatherData{state=1}, 1
// 老师回到教室..
// student receive update:WeatherData{state=1}, 1
// 学生回到教室..
// teacher receive update:WeatherData{state=2}, 2
// 老师离开教室..
// student receive update:WeatherData{state=2}, 2
// 学生离开教室..
