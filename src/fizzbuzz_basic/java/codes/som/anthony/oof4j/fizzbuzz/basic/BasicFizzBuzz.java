package codes.som.anthony.oof4j.fizzbuzz.basic;

public class BasicFizzBuzz implements Runnable {
    public static void main(String[] args) {
        new BasicFizzBuzz().run();
    }

    // Since this method overrides java.lang.Runnable's run,
    // it should not be remapped.
    public void run() {
        this.execute();
    }

    // This method should be remapped.
    private void execute() {
        String[] lookupTable = new String[] { null, "Fizz", "Buzz", "Fizz Buzz" };

        for (int i = 1; i <= 100; i++) {
            byte flags = 0;
            if (i % 3 == 0)
                flags |= 0x01;
            if (i % 5 == 0)
                flags |= 0x02;

            if (flags == 0) {
                System.out.println(i);
            } else {
                System.out.println(lookupTable[flags]);
            }
        }
    }
}
