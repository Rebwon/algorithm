package ko.maeng.stream;

import java.util.*;
import java.util.stream.*;

public class StreamTest {
    public static void main(String[] args) {
        // 배열 스트림 생성
        String[] arr = {"a","b","c"};
        Stream<String> stream = Arrays.stream(arr);
        Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);

        // 컬렉션 스트림 생성
        List<String> list = Arrays.asList("a","b","c");
        Stream<String> stream2 = list.stream();

        // Stream.Builder()
        Stream<String> builderStream = Stream.<String>builder()
                .add("Rebwon").add("John").add("Smith")
                .build();

        // Stream.generate()
        Stream<String> generatedStream = Stream.generate(() -> "gen").limit(5); //5개의 gen이 들어간 스트림 생성

        // Stream.iterate()
        Stream<Integer> integerStream = Stream.iterate(30, n -> n + 2).limit(5);    //초깃값30부터 2씩 증가한 스트림 생성

        IntStream intStream = IntStream.range(1, 5);    //1,2,3,4
        LongStream longStream = LongStream.rangeClosed(1, 5);   //1,2,3,4,5

        // Random클래스를 활용한 난수 생성
        DoubleStream doubles = new Random().doubles(3); //난수 3개 생성

        // 스트림 연결하기
        Stream<String> joinStream1 = Stream.of("Java", "JS", "Python");
        Stream<String> joinStream2 = Stream.of("Go", "Scala");
        Stream<String> concatStream = Stream.concat(joinStream1, joinStream2);  //Java, JS, Python, Go, Scala

        List<String> lang = Arrays.asList("Java", "Scala", "JS", "Python", "Go");
        lang.stream()
                .sorted()
                .collect(Collectors.toList());  //사전순 정렬

        lang.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());  //역순 정렬

        // 문자열 길이가 작은 순 정렬
        lang.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());

        //문자열 길이가 큰 순으로 정렬
        lang.stream()
                .sorted((s1, s2) -> s2.length() - s1.length())
                .collect(Collectors.toList());

        // Iterating
        int sum = IntStream.of(1,3,5,7,9)
                .peek(System.out::println)
                .sum();

        System.out.println(sum);    //25

        // 연산
        long count = IntStream.of(1,3,5,7,9).count();   //5
        long sum2 = IntStream.of(1,3,5,7,9).sum();      //25

        OptionalInt max = IntStream.of(1, 3, 5, 7, 9).max();
        OptionalInt min = IntStream.of(1, 3, 5, 7, 9).min();
    }
}
