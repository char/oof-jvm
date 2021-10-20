package codes.som.oof4j.anonymouslambda;

import java.util.function.*;

public class AnonymousLambda {
    public static void main(String[] args) {
        System.out.println("Built-in string supplier:");
        Supplier<String> builtInSupplier = () -> "Hello, world!";
        System.out.println(builtInSupplier.get());

        System.out.println("\nCustom supplier:");
        CustomStringSupplier customSupplier = () -> "Hello, world!";
        System.out.println(customSupplier.supply());
    }
}
