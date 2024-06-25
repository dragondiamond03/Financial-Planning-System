package pjb02.team1.financialplanning.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class PlanDTO extends BaseDTO {
    private int planId;
    private String planName;
    private int departmentId;
    private int planStatus;
    private int version;
    private TermDTO term;
}
