package java_basic_day14;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String> {

	@Override
	public String apply(String t, String u) {
		if (t.getBytes().length >= u.getBytes().length)
			return t;
		else
			return u;
	}

}

public class StreamTest2 {

	public static void main(String[] args) {

		String[] greetings = { "hi", "hello", "good morning", "nice to meet you", "hell" };
		// reduce()

		// 람다식으로 직접 구현
		System.out.println(Arrays.stream(greetings).reduce("", (s1, s2) -> {
			if (s1.getBytes().length >= s2.getBytes().length)
				return s1;
			else
				return s2;
		}));

		// BinaryOperator를 구현한 클래스 사용
		String str = Arrays.stream(greetings).reduce(new CompareString()).get();
		System.out.println(str);

	}

}
