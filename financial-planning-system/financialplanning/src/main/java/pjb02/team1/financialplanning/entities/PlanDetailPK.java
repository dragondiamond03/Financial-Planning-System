package pjb02.team1.financialplanning.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlanDetailPK {
    private String planDetailId;
    private String planId;
}