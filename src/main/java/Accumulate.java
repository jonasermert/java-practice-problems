import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Accumulate {

    public static <T> List<T> accumulate(List<T> list, UnaryOperator<T> operator) {
        List<T> result = new ArrayList<>();
        for (T element : list) {
            result.add(operator.apply(element));
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> input = List.of(1, 2, 3, 4, 5);
        UnaryOperator<Integer> square = x -> x * x;
        List<Integer> squaredValues = accumulate(input, square);
        System.out.println(squaredValues);
    }
}
