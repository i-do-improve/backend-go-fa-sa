package Domo.domain.entity;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberEntityRepository extends JpaRepository<MemberEntity, Long>{
	//쿼리 메서드 유형 : 문법에 맞지않으면 오류발생
	Optional<MemberEntity> findByEmailAndSocialAndField(String username, boolean b, boolean c);

}
