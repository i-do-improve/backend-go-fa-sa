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
@Table(name = "Cat_item")
@Entity
public class CatItemEntity extends BaseDateEntity{

	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;   //상품 번호
	
	@Column(nullable = false)
	private String title;  //상품 제목
	
	@Column(nullable = false)
	private long price;  //상품 가격
	
	@Column(nullable = false)
	private String info;  //상품 상세
	
	@Column(nullable = false)
	private long field; //워터마크여부 0:없음 1:있음 
	
	
	
    //고양이번호 fk- 고양이 카테고리 생성하면 추가할 예정 
	//파일번호 fk-  FileUtils 클래스를 만들어 사진파일 저장시 이름과 경로를 분리하여 저장하는 걸 만들면 그때 추가할 예정

}
