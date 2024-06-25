package pjb02.team1.financialplanning.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class AnnualReportDTO
{
    private int annualReportId;
    private int year;
    private long totalExpense;
    private int totalDepartment;
    private LocalDate createdDate;
}
