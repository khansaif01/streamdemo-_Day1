package stream_day1;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Day1 {

	public interface Calculator{
		public int sum(int a, int b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal=(a,b) -> {return a+b;};
		System.out.println("Sum of two number is : "+cal.sum(5, 7));
		Predicate<Integer> predicate=(a) -> (a>18);
		System.out.println("Testing "+5+" is grater to 18 or not : "+predicate.test(5));
	}

}
