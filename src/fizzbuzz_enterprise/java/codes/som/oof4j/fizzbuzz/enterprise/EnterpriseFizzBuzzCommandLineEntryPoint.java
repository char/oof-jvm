package codes.som.oof4j.fizzbuzz.enterprise;

import codes.som.oof4j.fizzbuzz.enterprise.computation.EnterpriseFizzBuzzComputationFactory;
import codes.som.oof4j.fizzbuzz.enterprise.results.FizzBuzzResultPublisher;

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
