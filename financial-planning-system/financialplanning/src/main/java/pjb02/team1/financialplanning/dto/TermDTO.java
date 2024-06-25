package pjb02.team1.financialplanning.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class TermDTO extends BaseDTO {
    private int termId;
    private String termName;
    private int duration;
    private LocalDate startDate;
    private LocalDate planDueDate;
    private LocalDate reportDueDate;
    private int termStatus;
}
