package codes.som.anthony.oof4j.interfaceoverlap;

public class InterfaceOverlap implements InterfaceA, InterfaceB {
    public static void main(String[] args) {
        InterfaceOverlap overlap = new InterfaceOverlap();
        overlap.methodA();
        overlap.methodB();
    }

    @Override
    public void methodA() {
        System.out.println("Method A");
    }

    @Override
    public void methodB() {
        System.out.println("Method B");
    }
}
