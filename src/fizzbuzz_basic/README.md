# FizzBuzz Basic

This is the simplest example in `oof4jvm`

It still raises one obfuscation snag - Method inheritance:
The `BasicFizzBuzz` class implements `java.lang.Runnable`, and overrides its `run()V` method.
This means that an obfuscator needs to keep the `run` name intact for the class to work.
