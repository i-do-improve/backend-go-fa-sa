package Domo.domain.entity;

public interface MemberEntityRepository {

	Object findByEmailAndSocialAndField(String username, boolean b, boolean c);

}
