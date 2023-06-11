package Domo.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@DynamicUpdate
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Table(name = "order")
@Entity
public class OrderEntity extends BaseDateEntity{

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;   // 주문번호

    @Enumerated(EnumType.STRING)
    private OrderType status; // 주문상태 : 주문대기/주문완료/주문취소

    @Column(nullable = false)
    private long count;    // 총주문수량

    @Column(nullable = false)
    private long price;    // 총주문금액

    @JoinColumn
    @ManyToOne(cascade = CascadeType.DETACH)
    private MemberEntity member; // 회원번호

    @JoinColumn
    @ManyToOne(cascade = CascadeType.DETACH)
    private CatItemEntity item; // 상품번호




}
