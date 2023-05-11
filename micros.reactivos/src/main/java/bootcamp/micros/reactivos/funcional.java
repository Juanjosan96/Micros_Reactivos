package bootcamp.micros.reactivos;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class funcional {

	public static void main(String[] args) {
		SpringApplication.run(funcional.class, args);
		
		List<Integer> numbers= List.of(18,6,4,15,55,78,12,9,8);
		
		List<Integer> count=numbers.stream()
				.filter(number->number>10)
				.collect(Collectors.toList());
		
		System.out.println(count);
	}

}
