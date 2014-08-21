package se.r2m.spring.ovning4;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("se")) {
			System.out.println("ApplicationContext: " + ctx);
			Thread.sleep(60_000);
		}
	}
}
