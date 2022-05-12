package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.CompanyDao;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SearchCompanyAndWorkerFacade {

    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    public List<Company> searchFromCompany (String name) {
        return companyDao.retrieveCompanyName(name);
    }

    public List<Employee> searchFromEmployee (String lastName) {
        return employeeDao.retrieveEmployeesByLastname(lastName);
    }
}
