package com.eb.h2.repository;


import 
org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.eb.entity.Job;

public interface JobRepository extends JpaRepository<Job, 
Long> {

}
