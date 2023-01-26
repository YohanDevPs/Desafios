package lambdasAndStreams;

//  Average Value (Java 8 Lambdas and Streams)
//  Write a method that returns the average of a list of integers.

import java.util.List;

public class Average {
    public static void main(String[] args) {

    }
    public Double average(List<Integer> list) {
        return list.stream().mapToInt(value -> value).average().getAsDouble();
    }
}
