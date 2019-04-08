# Interface Overlap

This example shows the edge case where one class implements two or more interfaces that have methods with the same signature.

When using an obfuscator that does not take this scenario into account, we can see strange behaviour: i.e.

InterfaceA works fine:
```java
public interface InterfaceA {
    void a(); // methodA
    void b(); // methodB
}
```

However, when shared inheritance is not taken into account, we see InterfaceB failing:
```java
public interface InterfaceB {
    void a(); // methodB
}
```

This means that when we have an implementing object:
```java
Object interfaceOverlap = // ...
((InterfaceB) interfaceOverlap).a(); // Uh oh!
```
