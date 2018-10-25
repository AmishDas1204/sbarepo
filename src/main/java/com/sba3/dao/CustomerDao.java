package com.sba3.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sba3.model.Customer;

//extending jpa repo
@Repository
public interface CustomerDao extends JpaRepository<Customer, Long>{
	
	

}
