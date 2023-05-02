package Domo.domain.entity;

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
@Table(name = "member")
@Entity
public class MemberEntity extends BaseDateEntity{
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long mno;   //회원번호
}
