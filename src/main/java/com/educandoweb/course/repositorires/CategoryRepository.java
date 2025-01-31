package com.educandoweb.course.repositorires;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
