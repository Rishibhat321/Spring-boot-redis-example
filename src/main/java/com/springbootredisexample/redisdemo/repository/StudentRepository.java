package com.springbootredisexample.redisdemo.repository;

import com.springbootredisexample.redisdemo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
