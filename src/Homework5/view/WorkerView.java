package Homework5.view;

import Homework5.data.Worker;

import java.util.List;

public class WorkerView {


    public void showResult(Worker worker) {

        if (worker != null) {
            System.out.println("Работник был добавлен");
        }
    }

    public void viewWorkers(List<Worker> workers) {

        if (workers.isEmpty()) {
            System.out.println("Список работников пуст");
            return;
        }
        System.out.println(workers);
    }
}
