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
@Table(name = "review")
@Entity
public class ReviewEntity extends BaseDateEntity{

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;   // 리뷰번호

    @Column(nullable = false)
    private String content; // 리뷰내용

    @JoinColumn
    @ManyToOne(cascade = CascadeType.DETACH)
    private MemberEntity member;

    @JoinColumn
    @ManyToOne(cascade = CascadeType.DETACH)
    private CatItemEntity cat_item;


}
