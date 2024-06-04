import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class TaskOnMapAndFilterMethod {

	public static void main(String[] args) {
		List<Integer> data = Arrays.asList(2,3,5,7,7,7,7,79,10,24,34,46,57,77);
		
		List<String> names= Arrays.asList("ravi","pawan","amadn","aapdf");
		
	
		
		
		
		List<String> strings = names.stream().peek(System.out::println).collect(Collectors.toList());
        System.out.println(strings);
		
		
		
//		List<String> strings = names.stream().map(String::toLowerCase).distinct().collect(Collectors.toList());
//        System.out.println("Distinct strings (ignore case): " + strings);
//		
		
		
		
		
		
//		OptionalDouble average = data.stream().mapToInt(Integer::intValue).average();
//		OptionalInt average2 = data.stream().mapToInt(Integer::intValue).max();
//		OptionalInt average3 = data.stream().mapToInt(Integer::intValue).min();
		
		
		
		
		
		
//      List<Integer> flattenedList = data.stream().flatMap(List::stream).collect(Collectors.toList());
		
		
		
//		String total = names.stream().collect(Collectors.joining(","));
//		System.out.println(total);
		
		
		
		
		
//	8.	OptionalDouble data3= data.parallelStream().mapToDouble(Integer::doubleValue).average();
//		System.out.println(data3);
//		
//		
		
		
//	7.	List<String> strings = names.stream().sorted().collect(Collectors.toList());
//
//		System.out.println(strings);
//		
		
		
		
//	6.	Integer data2 = data.stream().max(Integer::compareTo).orElse(null);
//		System.out.println(data2);

		
//	5.	List<String> namesWithA= ((Stream<String>) names.stream().filter(s->s.startsWith("a"))).collect(Collectors.toList());
//		System.out.println(namesWithA);
		
		
		
//	4.	List<Integer> distinct = data.stream().distinct().collect(Collectors.toList());
//		
//		System.out.println(distinct);
		
		
		
//	3.	int total= data.stream().mapToInt(Integer::intValue).sum();
//	
//		System.out.println(total);
		
	//2.	//names.stream().map(String::toUpperCase).forEach(System.out::println);
		
		
	//1.	//data.stream().filter(num->num%2==0).forEach(System.out::println);
		
		
		
		//data.stream().map(num->num%2==0?num+5:num+10).forEach(System.out::println); //ternary operator
		
		//System.out.println(data.stream().reduce());
		
		
		//data.stream().reduce(Integer::concat).getC
		
		
//		data.stream().filter(num -> {
//			
//	        for (int i = 2; i <= Math.sqrt(num); i++) {
//	            if (num % i == 0) {
//	                return false;
//	            }
//	        }
//	        return true;
//			
//		}).forEach(System.out::println);
		
		
		//filter((num)->num%2==0).map((num)->num+5).filter((num)->num%2!=0).map((num)->num+10).forEach(System.out::println);
			}
		}
		
		//data.stream().filter((num)->num%2!=0).map((num)->num+10).forEach(System.out::println);
		

		
		

	


