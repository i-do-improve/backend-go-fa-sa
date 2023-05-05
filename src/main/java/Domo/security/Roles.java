package Domo.security;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
//Enum
@Getter
@RequiredArgsConstructor //파이널 필드를 파라미터로 구성하는 생성자
public enum Roles {

	USER("ROLE_USER"), //기본 유저 권한
	ADMIN("ROLE_ADMIN"), //관리자 권한
	BASIC("ROLE_BASIC"), //베이직 구독 권한
	PREMIUM("ROLE_PREMIUM"); //프리미엄 구독 권한 


	private final String role; //getRole() //ROLE_USER or ROLE_ADMIN
}