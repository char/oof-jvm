package codes.som.anthony.oof4j.fizzbuzz.enterprise;

import codes.som.anthony.oof4j.fizzbuzz.enterprise.results.*;

import java.io.*;

public class EnterpriseFizzBuzzCommandLineResultSubscriber implements FizzBuzzResultSubscriber {
    private final PrintStream outputStream;

    public EnterpriseFizzBuzzCommandLineResultSubscriber(PrintStream outputStream) {
        this.outputStream = outputStream;
    }


    @Override
    public void onResult(FizzBuzzResult result) {
        outputStream.println(result.getAsString());
    }
}
