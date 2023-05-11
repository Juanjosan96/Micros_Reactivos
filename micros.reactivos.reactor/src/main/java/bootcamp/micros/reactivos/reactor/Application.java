package bootcamp.micros.reactivos.reactor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Sinks;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		Flux<String> publisher = Flux.just("Mensaje 1", "Mensaje 2", "Mensaje 3");

		Consumer consumer1 = new Consumer("Consumer 1");
		Consumer consumer2 = new Consumer("Consumer 2");

		publisher.subscribe(consumer1::onNext, consumer1::onError, consumer1::onComplete);
		publisher.subscribe(consumer2::onNext, consumer2::onError, consumer2::onComplete);

	}

}

class Consumer {
	private final String name;

	public Consumer(String name) {
		super();
		this.name = name;
	}

	public void onNext(String message) {
		System.out.println(name + " received: " + message);
	}

	public void onError(Throwable throwable) {
		System.out.println(name + " error: " + throwable.getMessage());
	}

	public void onComplete() {
		System.out.println(name + " completed");
	}
}