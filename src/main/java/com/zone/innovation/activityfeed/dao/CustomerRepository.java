package com.zone.innovation.activityfeed.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zone.innovation.activityfeed.model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer,Integer>{

}
