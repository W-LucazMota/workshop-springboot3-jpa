package com.educandoweb.course.repositorires;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
