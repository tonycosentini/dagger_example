package dagger_example;

import dagger.Component;

@Component(dependencies = ChildParentComponentOne.class)
public interface ChildComponentOne { }
