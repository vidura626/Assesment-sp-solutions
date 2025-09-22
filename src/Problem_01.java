import java.util.List;

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



    public int sumOfTheNumbersForGivenListUsingRecursion(List<Integer> numbers) {
        int sum = 0;
        int index = 0;
        while (index < numbers.size()){
            sum += numbers.get(index);
            index++;
        }
        return sum;
    }
}

