package Homework;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Pars parsData = new Pars();
        String newFileName;
        Write writeFile = new Write();

        HashMap<String, Object> data = parsData.parsInputData();
        while (data.size() != 6) {
            try {
                throw new DataEx();
            } catch (DataEx e) {
                data = parsData.parsInputData();
            }
        }

        newFileName = data.get("lastName") + ".txt";
        StringBuilder sb = new StringBuilder();
        for (String str : data.keySet()) {
            sb.append(data.get(str));
            sb.append(" ");
        }


        System.out.println(data);
        String filePath = newFileName;
        System.out.println(filePath);
        writeFile.write(String.valueOf(sb), filePath);

    }
}