package codes.som.anthony.oof4j.fizzbuzz.enterprise.computation;

import codes.som.anthony.oof4j.fizzbuzz.enterprise.*;

public class EnterpriseFizzBuzzComputationFactory {
    public static EnterpriseFizzBuzzComputationTask buildComputationTask() {
        return new EnterpriseFizzBuzzComputationTask(EnterpriseFizzBuzzExecutionEnvironment.getInstance().getIterations());
    }
}
