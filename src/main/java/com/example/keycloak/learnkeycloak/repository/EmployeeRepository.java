package com.example.keycloak.learnkeycloak.repository;

import com.example.keycloak.learnkeycloak.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {

}
