package codes.som.anthony.oof4j.lambda_tester;

public class LambdaTester {
    public static void main(String[] args) {
        String result = ((InterfaceSample) () -> "Lambdas!").getString();

        System.out.println("result = " + result + " : expected = Lambdas!");
    }
}

interface InterfaceSample {
    String getString();
}