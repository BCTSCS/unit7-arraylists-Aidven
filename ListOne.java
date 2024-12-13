import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOne {
    public static void main(String[] args) {
        // Creating ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();  // Type-safe list
        
        // Adding elements
        numbers.add(1);                // append in Python
        System.out.println(numbers);
        numbers.add(0, 2);    // insert in Python
        System.out.println(numbers);

        // Accessing elements
        int first = numbers.get(0);    // numbers[0] in Python
        int last = numbers.get(numbers.size() - 1);  // numbers[-1] in Python
        
        // Removing elements
        numbers.remove(numbers.size() - 1);  // pop() in Python
        System.out.println(numbers);
        numbers.remove(Integer.valueOf(1));   // remove(1) in Python
        System.out.println(numbers);
        numbers.remove(0);             // del numbers[0] in Python
        System.out.println(numbers);

        // Java -Use ListOne class and add below code Static typing with Generics
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add("string");  

        // Java
        nums.add(4);           // Add to end
        int length =  nums.size();  // Get length

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> subset = numbers.subList(1, 4);  // [2, 3, 4]

        // Java Basics method (accessType,staticOrNot, returnType, name( parameterList) )
        public static ArrayList<Integer> processList(ArrayList<Integer> numbers) {
            ArrayList<Integer> result = new ArrayList<>();
            for (Integer num : numbers) {
                if (num % 2 == 0) {
                    result.add(num * 2);
            }
        }
        return  result;
    }
    }
}