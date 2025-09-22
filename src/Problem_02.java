import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Problem_02 {
    public List<Object> combineTwoLists(List<Object> arr1, List<Object> arr2) {
        if (arr1.size() != arr2.size()) {
            return null;
        }
        List<Object> list = new ArrayList<>();
        for (int i = 0; i < arr1.size(); i++) {
            list.add(arr1.get(i));
            list.add(arr2.get(i));
        }
        return list;
    }

}

