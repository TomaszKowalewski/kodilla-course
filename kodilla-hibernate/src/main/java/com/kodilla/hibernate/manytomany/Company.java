package com.kodilla.hibernate.manytomany;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@NamedQuery(
        name = "Company.retrieveCompanyName",
        query = "FROM Company WHERE name like concat('%',:NAME_PART,'%')"
)
@NamedNativeQuery(
        name = "Company.retrieveCompaniesByFirstThreeLetters",
        query = "SELECT * FROM companies WHERE LEFT(company_name, 3) = :FIRSTTHREELETTERS ",
        resultClass = Company.class
)
@Entity
@Table(name = "COMPANIES")
public class Company {

    private int id;
    private String name;
    private List<Employee> employees = new ArrayList<>();


    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @Column(name = "COMPANY_ID")
    public int getId() {
        return id;
    }

    @NonNull
    @Column(name = "COMPANY_NAME")
    public String getName() {
        return name;
    }

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "companies")
    public List<Employee> getEmployees() {
        return employees;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}