package Domo.domain.entity;

import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass
public class BaseDateEntity {
    @CreationTimestamp
    private LocalDateTime createdDate;  //생성날짜
    @UpdateTimestamp
    private LocalDateTime updatedDate;  //수정날짜
}
