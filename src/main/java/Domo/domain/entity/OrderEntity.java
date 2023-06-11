package Domo.domain.entity;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicUpdate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@DynamicUpdate
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Table(name = "orders")
@Entity
public class OrderEntity{ 
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;   // 주문번호
    
    @CreationTimestamp
	private LocalDateTime orderedDate;//주문일

    @Column(nullable = false)
    private long count;    // 총주문수량

    @Column(nullable = false)
    private long price;    // 총주문금액

    @Enumerated(EnumType.STRING)
    private OrderType status; // 주문상태 : 주문대기/주문완료/주문취소
    
    @JoinColumn(nullable = false)
    @ManyToOne(cascade = CascadeType.DETACH)
    private MemberEntity member; // 회원번호

    @JoinColumn(nullable = false)
    @ManyToOne(cascade = CascadeType.DETACH)
    private CatItemEntity cat_item; // 상품번호



}
