package bootcamp.micros.reactivos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class imperativa {

	public static void main(String[] args) {
		SpringApplication.run(imperativa.class, args);
		
		List<Integer> numbers= List.of(18,6,4,15,55,78,12,9,8);
		
		List<Integer>count=new ArrayList<>();
		
		for(Integer number:numbers) {
			if(number>10) {
				count.add(number);
			}
		}
		
		System.out.println(count);
	}

}
