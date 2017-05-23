package dagger_example;

import dagger.Component;

@Component(modules = Module.class)
public interface ParentComponent extends ChildParentComponentOne, ChildParentComponentTwo {

    @Override
    Integer integer();
}
