package com.icebear2n2.deliveryservice.domain.repository;

import com.icebear2n2.deliveryservice.domain.entity.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryRepository extends JpaRepository<Delivery, Long> {
    boolean existsByDeliveryId(Long deliveryId);
}
