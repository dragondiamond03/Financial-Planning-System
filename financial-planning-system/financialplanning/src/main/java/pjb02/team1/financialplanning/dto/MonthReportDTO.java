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
public class MonthReportDTO extends BaseDTO{

    private int monthReportId;
    private LocalDate month;
    private int departmentId;
    private int reportStatus;
    private int version;
    private int termId;
}
