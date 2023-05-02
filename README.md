----------------------------------------
초기 setting

spring Boot Devetools
lombok
spring Configuration Processor
Spring Data JPA
MariaDB Driver
Spring Security
OAuth2 Client
Spring Web

----------------------------------------
----------------------------------------
DB 설정

AWS EDS 데이터베이스 : mysql

이름 : mysqldb-1
관리자이름 : *****
비밀번호 : **********
엔드포인트 : mysqldb-1.cqsnon7x2qsw.ap-northeast-2.rds.amazonaws.com

파라미터 그룹 : mysqldbparametergroup

파라미터 그룹 설정 수정 항목
max_connections : {DBInstanceClassMemory/1000}
char : utf8mb4, utf8mb4_unicode_ci
time_zone : Asia/Seoul

----------------------------------------
----------------------------------------
security

https://docs.spring.io/spring-security/reference/servlet/configuration/java.html
(spring.io 의 DOC참고)

@EnableWebSecurity 어노테이션하여 SecurityFilterChain Bean적용(httpSecurity)

https://docs.spring.io/spring-security/reference/servlet/authentication/passwords/dao-authentication-provider.html
springSecurity에서 제공하는 로그인폼을 활용하여 DaoAuthenticationProvider로 인증

----------------------------------------
----------------------------------------
entity
https://www.erdcloud.com/d/tgAot9F2ve76t2Ccc
![image](https://user-images.githubusercontent.com/107745857/235657254-260b6381-89a2-4618-bcdc-5c204d2559dd.png)
