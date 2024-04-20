package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modal.Security;


public interface SecurityRepo extends JpaRepository<Security , Long>
{

}
