package bootcamp.micros.reactivos.webflux.controller;

import java.time.Duration;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
public class numberController {

	@GetMapping(value="/numbers",produces=MediaType.TEXT_EVENT_STREAM_VALUE)
	public Flux<Integer>getNumbers(){
		return Flux.range(1, 30)
				.delayElements(Duration.ofSeconds(1));
	}
}
