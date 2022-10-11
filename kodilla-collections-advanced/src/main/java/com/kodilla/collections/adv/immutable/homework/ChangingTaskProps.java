package com.kodilla.collections.adv.immutable.homework;

public class ChangingTaskProps extends Task {
    public ChangingTaskProps(String title, int duration) {
        super(title, duration);
    }

    public void modifyTitle(String newTitle) {
        title = newTitle;
    }
}
