package Domo.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@DynamicUpdate
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Table(name = "reply")
@Entity
public class Reply extends BaseDateEntity{

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id; // 댓글 번호

    @Column(nullable = false)
    private String content;    // 댓글 내용

    @JoinColumn
    @ManyToOne(cascade = CascadeType.DETACH)
    private CustomerBoard board; // 게시글 번호

    @JoinColumn
    @ManyToOne(cascade = CascadeType.DETACH)
    private MemberEntity member; // 작성자 회원 번호








}
