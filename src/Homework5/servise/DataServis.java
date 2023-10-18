package Homework5.servise;

import Homework5.data.Worker;

import java.util.List;

public interface DataServis {

    Worker create1(String name, String age, String workExperience, String maritalMtatus, String directorSalary);

    Worker create2(String name, String age, String workExperience, String maritalMtatus, String directorSalary);

    Worker create3(String name, String age, String workExperience, String maritalMtatus, String directorSalary);

    List<Worker> read1();
}
