package br.com.fiap.abctechapi.repository;

import br.com.fiap.abctechapi.controller.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}