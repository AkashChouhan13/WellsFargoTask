package com.example.demo.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modal.Client;



public interface ClientRepo extends JpaRepository<Client, Long>
{
}
