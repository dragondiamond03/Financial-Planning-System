package pjb02.team1.financialplanning.dto;

import jakarta.persistence.MappedSuperclass;
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
public abstract class BaseDTO {
    private int createId;
    private int updateId;
    private LocalDateTime createDateTime;
    private LocalDateTime updateDateTime;
    private boolean deleteFlag;
}
