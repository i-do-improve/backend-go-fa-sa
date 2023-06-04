package Domo.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "customer_board")
@Entity
public class CustomerBoard extends BaseDateEntity{

	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;   //게시글번호
	
	@Column(nullable = false)   
    private String title;    //게시글제목
	
	@Column(nullable = false)   
    private String content;    //게시글내용
	
	@Enumerated(EnumType.STRING)
    private BoardType type; //문의글 종류  결제문의/구독문의/기타문의
	
	@JoinColumn
    @ManyToOne(fetch = FetchType.EAGER)
    private MemberEntity memId; //작성자 회원 번호
	
	
}
