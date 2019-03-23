package org.app.woker;

import java.util.Arrays;

 class WorkerInfoStore {
    private final static WorkerInfoStore workInfoStore = new WorkerInfoStore();
    private Worker[] managers = new Manager[0];
    private Worker[] programmers = new Programmer[0];
    private Worker[] qaEngineers = new QAEngineer[0];

    private WorkerInfoStore() {
    }

    static WorkerInfoStore of() {
        return workInfoStore;
    }

    //добавить в массив managers
    private void add(Manager worker) {
        managers = addNewWorker(managers, worker);
    }

    //добавить в массив programmers
    private void add(Programmer worker) {
        programmers = addNewWorker(programmers, worker);
    }

    //добавить в массив qaEngineers
    private void add(QAEngineer worker) {
        qaEngineers = addNewWorker(qaEngineers, worker);
    }


    private Worker[] addNewWorker(Worker[] workerArray, Worker worker) {
        workerArray = Arrays.copyOf(workerArray, workerArray.length + 1);
        workerArray[workerArray.length - 1] = worker;
        return workerArray;
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
