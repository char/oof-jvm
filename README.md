# oof

The 'Obfuscation of Fickleties' dataset contains some self-contained Java applications which demonstrate an edge case to consider when obfuscating.

## Build

With `./gradlew <sample_name>`, each sample will produce its own JAR file in the `build/libs` directory.

e.g:
```sh
$ ./gradlew fizzbuzz_basic
$ # use build/libs/fizzbuzz_basic.jar
```
