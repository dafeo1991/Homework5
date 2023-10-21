package Homework5.controll;

import Homework5.data.Worker;
import Homework5.servise.DataServis;
import Homework5.servise.WorkerServise;
import Homework5.view.WorkerView;

import java.util.List;

public class Controll {

    DataServis dataServis;
    WorkerView workerView;

    public Controll() {
        this.dataServis = new WorkerServise();
        this.workerView = new WorkerView();
    }

    public void sendReq1(String name, String age, String workExperience, String maritalMtatus, String salary) {
        Worker worker = dataServis.create1(name, age, workExperience, maritalMtatus, salary);
        workerView.showResult(worker);

    }

    public void sendReq2(String name, String age, String workExperience, String maritalMtatus, String salary) {
        Worker worker = dataServis.create2(name, age, workExperience, maritalMtatus, salary);
        workerView.showResult(worker);

    }

    public void sendReq3(String name, String age, String workExperience, String maritalMtatus, String salary) {
        Worker worker = dataServis.create3(name, age, workExperience, maritalMtatus, salary);
        workerView.showResult(worker);

    }


    public void sendReq1() {
        List<Worker> workers = dataServis.read1();
        workerView.viewWorkers(workers);
    }


}
