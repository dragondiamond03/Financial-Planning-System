package pjb02.team1.financialplanning.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@MappedSuperclass
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public abstract class BaseEntity {

    @Column(name = "CREATE_ID", columnDefinition = "INT")
    private Integer createId;

    @Column(name = "UPDATE_ID", columnDefinition = "INT")
    private Integer updateId;

    @Column(name = "CREATE_DATE_TIME", columnDefinition = "DATETIME")
    private LocalDateTime createDateTime;

    @Column(name = "UPDATE_DATE_TIME", columnDefinition = "DATETIME")
    private LocalDateTime updateDateTime;

    @Column(name = "DELETE_FLAG", columnDefinition = "BIT")
    private boolean deleteFlag;
}
