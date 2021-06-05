package com.devdaviuc.hsworker.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.devdaviuc.hsworker.entities.Worker;
import com.devdaviuc.hsworker.repositories.WorkerRepository;

@Configuration
@Profile("test")
public class Initializable implements CommandLineRunner {

	@Autowired
	private WorkerRepository workerRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Worker w1 = new Worker(null, "Bob", 200.00);
		Worker w2 = new Worker(null, "Maria", 300.00);
		Worker w3 = new Worker(null, "Alex", 250.00);
		
		workerRepository.saveAll(Arrays.asList(w1,w2,w3));
	}

}
