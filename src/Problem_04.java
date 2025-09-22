import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class Problem_04 {
    public Integer findFormedLargestNumbersOfTheArray(List<Integer> list) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (Integer integer : list) {
            Integer i = integer;
            char c = i.toString().charAt(0);
            int firstDigit = Integer.parseInt(c + "");
            map.put(firstDigit, i);
        }
        StringBuilder builder = new StringBuilder();
        map.descendingMap().forEach((key, value) -> builder.append(map.get(key).toString()));
        return Integer.parseInt(builder.toString());
    }

}

