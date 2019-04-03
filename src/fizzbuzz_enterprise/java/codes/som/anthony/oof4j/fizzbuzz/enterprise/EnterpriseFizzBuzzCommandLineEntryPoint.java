package codes.som.anthony.oof4j.fizzbuzz.enterprise;

import codes.som.anthony.oof4j.fizzbuzz.enterprise.computation.*;
import codes.som.anthony.oof4j.fizzbuzz.enterprise.results.*;

public class EnterpriseFizzBuzzCommandLineEntryPoint {
    public static void main(String[] args) {
        if (args.length == 1) {
            try {
                int iterations = Integer.parseInt(args[0]);
                if (iterations < 1)
                    throw new NumberFormatException();

                EnterpriseFizzBuzzExecutionEnvironment.getInstance().setIterations(iterations);
            } catch (NumberFormatException ignored) {
                System.err.println("Invalid number of iterations specified: " + args[0]);
                System.exit(1);
            }
        }

        Runnable task = EnterpriseFizzBuzzComputationFactory.buildComputationTask();
        ((FizzBuzzResultPublisher) task).registerSubscriber(new EnterpriseFizzBuzzCommandLineResultSubscriber(System.out));

        task.run();
    }
}
