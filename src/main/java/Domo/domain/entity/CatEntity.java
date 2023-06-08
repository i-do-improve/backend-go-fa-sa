package Domo.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "cat")
@Entity
public class CatEntity {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;   //고양이 번호
	
	@Column(nullable = false)
	private String name; // 고양이 이름
	
	@Column(nullable = false)
	private String species; //고양이 종류
	
	private long birth; //고양이 생년월일
	
	private String love_snack; //좋아하는 간식
	
	private String info; //고양이 정보(자주하는 행동)
	
	private String etc; //고양이 특이사항
}
