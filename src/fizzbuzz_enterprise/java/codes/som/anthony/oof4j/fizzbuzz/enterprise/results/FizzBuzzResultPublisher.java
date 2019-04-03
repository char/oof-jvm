package codes.som.anthony.oof4j.fizzbuzz.enterprise.results;

public interface FizzBuzzResultPublisher {
    void registerSubscriber(FizzBuzzResultSubscriber subscriber);
    void unregisterSubscriber(FizzBuzzResultSubscriber subscriber);
}
