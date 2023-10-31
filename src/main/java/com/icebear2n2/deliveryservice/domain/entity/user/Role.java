package com.icebear2n2.deliveryservice.domain.entity.user;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Role {
    ROLE_USER,
    ROLE_KAKAO_USER,
    ROLE_ADMIN,
    ;
}
