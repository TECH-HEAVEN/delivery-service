package com.icebear2n2.deliveryservice.domain.repository;

import com.icebear2n2.deliveryservice.domain.entity.order.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
