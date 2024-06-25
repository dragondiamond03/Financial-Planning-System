package pjb02.team1.financialplanning.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class AnnualReportDetailDTO
{
        private int annualReportDetailId;
        private int departmentId;
        private long totalExpense;
        private long biggestExpenditure;
        private int costType;
        private int annualReportId;
}
