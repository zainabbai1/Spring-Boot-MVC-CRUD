package com.dev.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.springboot.model.Invoice;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> 
{

}