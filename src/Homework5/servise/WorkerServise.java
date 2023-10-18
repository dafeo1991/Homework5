package Homework5.servise;

import Homework5.data.Director;
import Homework5.data.Manager;
import Homework5.data.Seller;
import Homework5.data.Worker;

import java.util.ArrayList;
import java.util.List;

public class WorkerServise implements DataServis {

    List<Worker> workerList = new ArrayList<>();
    @Override
    public Worker create1(String name, String age, String workExperience, String maritalMtatus, String directorSalary) {
        Director director= new Director(name, age, workExperience, maritalMtatus, directorSalary);
        workerList.add(director);
        return director;
    }
    @Override
    public Worker create2(String name, String age, String workExperience, String maritalMtatus, String directorSalary) {
        Manager manager = new Manager(name, age, workExperience, maritalMtatus, directorSalary);
        workerList.add(manager);
        return manager;
    }

    @Override
    public Worker create3(String name, String age, String workExperience, String maritalMtatus, String directorSalary) {
        Seller seller = new Seller(name, age, workExperience, maritalMtatus, directorSalary);
        workerList.add(seller);
        return seller;
    }



    @Override
    public List<Worker> read1() {
        return workerList;
    }
}
