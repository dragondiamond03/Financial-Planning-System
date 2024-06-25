package pjb02.team1.financialplanning.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@IdClass(PlanDetailPK.class)
@Table(name = "PLAN_DETAIL")
public class PlanDetail {

    @Id
    @Column(name = "PLAN_DETAIL_ID", columnDefinition = "NVARCHAR(20)")
    @GeneratedValue(generator = "PLAN_DETAIL_ID")
    @GenericGenerator(name = "PLAN_DETAIL_ID", strategy = "pjb02.team1.financialplanning.common.utils.PlanDetailIdGenerator")
    private String planDetailId;

    @Id
    @Column(name = "PLAN_ID", columnDefinition = "NVARCHAR(20)")
    private String planId;

    @Column(name = "EXPENSE", columnDefinition = "NVARCHAR(255)")
    private String expense;

    @Column(name = "COST_TYPE", columnDefinition = "INT")
    private int costType;

    @Column(name = "UNIT_PRICE", columnDefinition = "DECIMAL(18,0)")
    private long unitPrice;

    @Column(name = "AMOUNT", columnDefinition = "INT")
    private int amount;

    @Column(name = "PROJECT_NAME", columnDefinition = "NVARCHAR(255)")
    private String projectName;

    @Column(name = "SUPPLIER_NAME", columnDefinition = "NVARCHAR(255)")
    private String supplierName;

    @Column(name = "PIC", columnDefinition = "NVARCHAR(255)")
    private String pic;

    @Column(name = "NOTE", columnDefinition = "NVARCHAR(255)")
    private String note;

    @Column(name = "EXPENSE_STATUS", columnDefinition = "INT")
    private int expenseStatus;

    @ManyToOne
    @JoinColumn(name = "PLAN_ID", referencedColumnName = "PLAN_ID")
    private Plan plan;
}
