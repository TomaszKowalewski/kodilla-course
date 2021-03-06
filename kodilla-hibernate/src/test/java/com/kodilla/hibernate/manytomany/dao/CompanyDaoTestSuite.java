package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.CompanyDao;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
class CompanyDaoTestSuite {

   @Autowired
    private CompanyDao companyDao;
   @Autowired
    private EmployeeDao employeeDao;

    @Test
    void testManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMastersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int grayMatterId = greyMatter.getId();

        //Then
        assertNotEquals(0, softwareMachineId);
        assertNotEquals(0, dataMastersId);
        assertNotEquals(0, grayMatterId);

        //CleanUp
        try {
            companyDao.deleteAll();

        } catch (Exception e) {
            //do nothing
        }
    }

   @Test
    void testQueriesFindByLastname() {
        //Given
         Employee johnSmith = new Employee("John", "Smith");
         Company softwareMachines = new Company("Software Machines");
         softwareMachines.getEmployees().add(johnSmith);
         johnSmith.getCompanies().add(softwareMachines);

         //When
         employeeDao.save(johnSmith);
         int johnSmithId = johnSmith.getId();
         List<Employee> employeesWithLastName = employeeDao.retrieveEmployeesByLastname("Smith");

         //Then
         assertEquals(1, employeesWithLastName.size());

         //CleanUp
         employeeDao.deleteAll();
     }

    @Test
    void testQueriesFindByLastThreeLetters(){
         //Given
         Employee johnSmith = new Employee("John", "Smith");

         Company softwareMachines = new Company("Software Machines");

         softwareMachines.getEmployees().add(johnSmith);

         johnSmith.getCompanies().add(softwareMachines);

         //When
         companyDao.save(softwareMachines);
         int softwareMachinesId = softwareMachines.getId();

         List<Company> companiesWithThreeFirsLetters = companyDao.retrieveCompaniesByFirstThreeLetters("Sof");

         //Then
         assertEquals(1, companiesWithThreeFirsLetters.size());

         //CleanUp
         companyDao.deleteAll();
     }
}
