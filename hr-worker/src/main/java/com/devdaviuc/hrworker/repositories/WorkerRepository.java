package com.devdaviuc.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devdaviuc.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
