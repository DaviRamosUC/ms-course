package com.devdaviuc.hsworker.resources;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devdaviuc.hsworker.entities.Worker;
import com.devdaviuc.hsworker.repositories.WorkerRepository;

@RestController
@RequestMapping(value = "/workers")
public class WorkerResource {
	
	private static Logger logger = org.slf4j.LoggerFactory.getLogger(WorkerResource.class);

	@Autowired
	private Environment env;
	
	@Autowired
	private WorkerRepository repository;

	@GetMapping()
	public ResponseEntity<List<Worker>> findAll() {
		List<Worker> lista = repository.findAll();
		return ResponseEntity.ok().body(lista);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Worker> findById(@PathVariable Long id) {
		logger.info("PORT = "+ env.getProperty("local.server.port"));
		
		Worker obj = repository.findById(id).orElse(null);
		return ResponseEntity.ok().body(obj);
	}

}
