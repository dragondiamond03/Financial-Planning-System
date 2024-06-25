package pjb02.team1.financialplanning.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PlanDetailDTO {
    private int planDetailId;
    private String expense;
    private int costType;
    private long unitPrice;
    private int amount;
    private String projectName;
    private String supplierName;
    private String pic;
    private String note;
    private int expenseStatus;
}
