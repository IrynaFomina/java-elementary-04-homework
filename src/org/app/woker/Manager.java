package org.app.woker;

public class Manager extends Worker {
    private String project;
    private int expirience;

    @Override
    public String getWorkerPosition() {
        return "Manager";
    }
}
