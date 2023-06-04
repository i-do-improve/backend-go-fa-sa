package Domo.domain.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

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
@Table(name = "Cart")
@Entity
public class CartEntity{

	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;   //장바구니 번호
	
	private long price; //가격
	
	@JoinColumn //member_id
    @OneToOne
    private MemberEntity member_id; //회원 번호
	
	@JoinColumn //Cat_item_id
    @ManyToOne(fetch = FetchType.EAGER)
    private CartEntity Cat_item_id; //고양이 사진 상품 번호
}