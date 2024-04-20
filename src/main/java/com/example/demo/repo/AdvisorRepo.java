package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modal.Advisor;


public interface AdvisorRepo extends JpaRepository<Advisor, Long>
{
}

