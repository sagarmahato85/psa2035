package com.crm.repository;

import com.crm.entity.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepository extends JpaRepository<Laptop,Integer> {
}
