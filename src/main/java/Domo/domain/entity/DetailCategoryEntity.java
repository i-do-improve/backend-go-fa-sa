package Domo.domain.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import Domo.security.Roles;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@DynamicUpdate
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Table(name = "detail_category")
@Entity
public class DetailCategoryEntity {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;   //디테일 카테고리 번호
	
	@Enumerated(EnumType.STRING)
    private Roles type; //멤버쉽 권한 종류 기본/관리자/베이직/프리미엄
	
	@JoinColumn //fk : category_id
    @ManyToOne
    private CategoryEntity category; 
	
	@JoinColumn //fk : cat_id
    @ManyToOne
    private CatEntity cat;// 고양이
	
	
}
