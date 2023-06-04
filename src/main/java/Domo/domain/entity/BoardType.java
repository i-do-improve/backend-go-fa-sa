package Domo.domain.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum BoardType {
    결제문의("결제문의"),
    구독문의("구독문의"),
    기타문의("기타문의");

    private final String BoardType;


}