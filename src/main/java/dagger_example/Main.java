package dagger_example;

public class Main {

    public static void main(String[] args) {
        ParentComponent parentComponent = DaggerParentComponent.builder().build();

        parentComponent.integer();
        parentComponent.string();

        ChildComponentOne childComponent = DaggerChildComponentOne.builder()
                .childParentComponentOne(parentComponent)
                .build();
    }
}
