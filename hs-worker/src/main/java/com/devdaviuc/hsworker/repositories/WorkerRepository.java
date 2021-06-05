package com.devdaviuc.hsworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devdaviuc.hsworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
