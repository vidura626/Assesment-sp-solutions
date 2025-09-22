import java.util.List;
import java.util.Objects;

public class Problem_01 {
    public int sumOfTheNumbersForGivenListUsingForLoop(List<Integer> numbers) {
        int sum = 0;
        for(int i = 0; i < numbers.size(); i++){
            sum += numbers.get(i);
        }
        return sum;
    }


    public int sumOfTheNumbersForGivenListUsingWhileLoop(List<Integer> numbers) {
        int sum = 0;
        int index = 0;
        while (index < numbers.size()){
            sum += numbers.get(index);
            index++;
        }
        return sum;
    }



    public int sumOfTheNumbersForGivenListUsingRecursion(List<Integer> numbers, Integer sum) {
        if(numbers.isEmpty()){
            return sum;
        }
        sum += numbers.get(0);
        numbers.remove(0);
        return sumOfTheNumbersForGivenListUsingRecursion(numbers, sum);
    }
}

