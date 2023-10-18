package Homework5.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor


public abstract class Worker {

    String name;
    String age;
    String workExperience;
    String maritalMtatus;

}
