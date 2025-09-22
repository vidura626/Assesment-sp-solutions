import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Problem_01 problem1 = new Problem_01();


        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int sumOfTheNumbersForGivenListUsingForLoop = problem1.sumOfTheNumbersForGivenListUsingForLoop(list);
        System.out.println("Sum of the number using for loop : " + sumOfTheNumbersForGivenListUsingForLoop);

        int sumOfTheNumbersForGivenListUsingWhileLoop = problem1.sumOfTheNumbersForGivenListUsingWhileLoop(list);
        System.out.println("Sum of the numbers using while loop : " + sumOfTheNumbersForGivenListUsingWhileLoop);
    }
}