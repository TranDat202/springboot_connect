package com.learncode;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learncode.model.Student;

public interface StudentRepositori extends JpaRepository<Student, Long> {

}
