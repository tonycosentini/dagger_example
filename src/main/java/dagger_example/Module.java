package dagger_example;

import dagger.Provides;

@dagger.Module
public abstract class Module {

    @Provides
    static Integer integer() {
        return System.nanoTime() % 2 == 0 ? 4 : 5;
    }

    @Provides
    static String string() {
        return System.nanoTime() % 2 == 0 ? "hello" : "world";
    }
}
