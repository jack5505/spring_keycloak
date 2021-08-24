package com.example.keycloak.learnkeycloak.controller;

import com.example.keycloak.learnkeycloak.entity.EmployeeEntity;
import com.example.keycloak.learnkeycloak.model.Employee;
import com.example.keycloak.learnkeycloak.repository.EmployeeRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;


    @PostMapping("/employees")
    public ResponseEntity<?> save(@RequestBody Employee employeeDto){
        EmployeeEntity entity = new EmployeeEntity();
        BeanUtils.copyProperties(employeeDto,entity);
        return ResponseEntity.ok(employeeRepository.save(entity));
    };

    @GetMapping("/employees")
    public ResponseEntity<?> getAllEmployee(){
        return ResponseEntity.ok(employeeRepository.findAll());
    }

}
