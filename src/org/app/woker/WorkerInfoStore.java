package org.app.woker;

import java.util.Arrays;

public class WorkerInfoStore {
    private Manager[] managers = new Manager[0];
    private Programmer[] programmers = new Programmer[0];
    private QAEngineer[] qaEngineers = new QAEngineer[0];


    //добавить в массив managers
    private void add(Manager worker) {
        managers = Arrays.copyOf(managers, managers.length + 1);
        managers[managers.length - 1] = worker;
    }

    //добавить в массив programmers
    private void add(Programmer worker) {
        programmers = Arrays.copyOf(programmers, programmers.length + 1);
        programmers[programmers.length - 1] = worker;
    }

    //добавить в массив qaEngineers
    private void add(QAEngineer worker) {
        qaEngineers = Arrays.copyOf(qaEngineers, qaEngineers.length + 1);
        qaEngineers[qaEngineers.length - 1] = worker;
    }

    /**
     * В этом методе проанализировать тип worker - с помощью instanceof.
     * Если тип - Manager - добавить в массив managers
     * Если тип - Programmer - добавить в массив managers
     * Если тип - QAEngeneer - добавить в массив qaEngeneers
     **/
    void add(Worker worker) {
        if (worker instanceof Manager) {
            add((Manager) worker);
        } else if (worker instanceof Programmer) {
            add((Programmer) worker);
        } else {
            add((QAEngineer) worker);
        }
    }
}
