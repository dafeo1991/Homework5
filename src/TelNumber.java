import java.util.*;


public class TelNumber {
    private Map<String, List<String>> map = new HashMap<>();

    void add(String telNum, String name) {
        if (map.containsKey(name)) {
            List<String> telNumbers  = map.get(name);
            telNumbers.add(telNum);
        } else {
            List<String> telNumbers = new ArrayList<>();
            telNumbers.add(telNum);
            map.put(name, telNumbers);
        }

    }


    String getAll() {
        StringBuilder stringBuilder = new StringBuilder();
        List<Map.Entry<String, List<String>>> entries = new ArrayList<>(map.entrySet());
        entries.sort((entry1, entry2) -> Integer.compare(entry2.getValue().size(), entry1.getValue().size()));
        for (Map.Entry<String, List<String>> entry : entries) {
            List<String> telNumbers = entry.getValue();
            stringBuilder.append(entry.getKey())
                         .append(" : ")
                         .append(telNumbers)
                         .append("\n");
        }
        return stringBuilder.toString();
    }

}

