package com.example.demo.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modal.Portfolio;


public interface PortfolioRepo extends JpaRepository<Portfolio , Long> {
}
