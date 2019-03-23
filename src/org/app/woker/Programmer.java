package org.app.woker;

public class Programmer extends Worker {
    private String language;
    private String rate;


    @Override
    public String getWorkerPosition() {
        return "Programmer";
    }
}
