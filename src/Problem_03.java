import java.util.ArrayList;
import java.util.List;

public class Problem_03 {
    public List<Integer> calculateFirst100FibbonacciNumbers() {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        for (int i = 2; i <= 100; i++) {
            list.add(list.get(i-1) + list.get(i-2));
        }
        return list;
    }

}

