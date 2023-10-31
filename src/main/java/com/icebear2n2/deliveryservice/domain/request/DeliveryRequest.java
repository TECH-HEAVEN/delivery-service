package com.icebear2n2.deliveryservice.domain.request;

import com.icebear2n2.deliveryservice.domain.entity.Delivery;
import com.icebear2n2.deliveryservice.domain.entity.DeliveryStatus;
import com.icebear2n2.deliveryservice.domain.entity.order.Order;
import com.icebear2n2.deliveryservice.domain.entity.user.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DeliveryRequest {
    private Long userId;
    private Long orderId;
    private Timestamp estimatedArrival;
    private String courierName;

    public Delivery toEntity(User user, Order order) {
        return Delivery.builder()
                .user(user)
                .order(order)
                .status(DeliveryStatus.SHIPPED)
                .estimatedArrival(estimatedArrival)
                .courierName(courierName)
                .build();
    }
}
