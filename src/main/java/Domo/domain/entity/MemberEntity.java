package Domo.domain.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "member")
@Entity
public class MemberEntity extends BaseDateEntity{
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;   //회원번호
	@Column(unique = true,nullable = false)   //unique not null
    private String email;   //username - 이메일

    @Column(nullable = false)   //not null
    private String pass;    //비밀번호

    @Column(unique = true)
    private String nickName; //닉네임

    private boolean social;     // 소셜유저여부
    private boolean field ;    // 구독여부
    
    
    //ROLE정보 --enum 사용
    @Builder.Default
    @CollectionTable(name = "role")
    @Enumerated(EnumType.STRING)    //저장유형 문자열로(롤 확장시 유리) 기본 ordinal(숫자)
    @ElementCollection(fetch = FetchType.EAGER) //1:N member테이블에서만 접근가능한 내장테이블로 만들어줌
    private Set<Roles> roles = new HashSet<>();
    
    //role적용을 위한 편의메서드
    public MemberEntity addRole(Roles role){
        this.roles.add(role);
        return this;
    }

}
