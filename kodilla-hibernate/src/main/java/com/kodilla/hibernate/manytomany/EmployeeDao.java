package com.kodilla.hibernate.manytomany;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface EmployeeDao extends CrudRepository <Employee, Integer> {
}
