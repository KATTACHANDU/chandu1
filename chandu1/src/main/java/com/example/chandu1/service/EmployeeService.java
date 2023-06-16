package com.example.chandu1.service;

import com.example.chandu1.model.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeService {
    void createEmployee();

    public void createEmployee(Employee emp);
    public void showAllEmployee();
    public void showEmployeeBasedOnId(int id);

    void showEmployeeBasedOnID(int id);

    public void updateEmployee(int id, String name);
    public void deleteEmployee(int id);


}
