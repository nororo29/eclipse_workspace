package java_basic_day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {

		String[] sl = { "abcde", "abc", "abcdef", "ab" };
		
//		Stream<String> st = sl.stream();  //배열은 이렇게 안됨 -> collection얘들....스트림쓰는방법

		Arrays.stream(sl).filter(s -> s.length() >= 5).forEach(s -> System.out.println(s));

		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.stream(arr).sum());
		System.out.println(Arrays.stream(arr).count()); // count() 반환형은 long
		System.out.println(Arrays.stream(arr).max());
		System.out.println(Arrays.stream(arr).min());
		System.out.println(Arrays.stream(arr).average());

		List<String> sList = new ArrayList<String>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");

//		sList.stream().forEach(s -> System.out.println(s));
		Stream<String> stream = sList.stream();
		stream.forEach(s -> System.out.print(s + " ")); // stream 소모됨,,, 다시 못씀 새로 생성해야함
		System.out.println();

		// stream has already been operated upon or closed
//		stream.sorted().forEach(s -> System.out.println(s)); //java.lang.IllegalStateException
		
		Stream<String> stream2 = sList.stream();
		stream2.sorted().forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		System.out.println(sList.stream().reduce("", (a, b) -> a + b));

	}

}
