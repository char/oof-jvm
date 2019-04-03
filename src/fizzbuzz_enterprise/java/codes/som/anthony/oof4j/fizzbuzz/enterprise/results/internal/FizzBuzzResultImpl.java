package codes.som.anthony.oof4j.fizzbuzz.enterprise.results.internal;

import codes.som.anthony.oof4j.fizzbuzz.enterprise.results.*;

public class FizzBuzzResultImpl implements FizzBuzzResult {
    private final int flags;
    private final String representation;

    public FizzBuzzResultImpl(int number, String representation) {
        this.flags = number;
        this.representation = representation;
    }


    @Override
    public int getNumber() {
        return flags;
    }

    @Override
    public String getAsString() {
        return representation;
    }
}
