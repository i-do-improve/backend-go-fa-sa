package Domo.domain.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum OrderType {

    주문대기("주문대기"),
    주문완료("주문완료"),
    주문취소("주문취소");

    private final String OrderType;


}
