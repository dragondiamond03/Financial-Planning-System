package pjb02.team1.financialplanning.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;

@Data
@Entity
@Builder
@IdClass(MonthReportDetailPK.class)
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "MONTH_REPORT_DETAIL")
public class MonthReportDetail{

    @Id
    @Column(name = "MONTH_REPORT_DETAIL_ID", columnDefinition = "NVARCHAR(20)")
    @GeneratedValue(generator = "MONTH_REPORT_DETAIL_ID")
    @GenericGenerator(name = "MONTH_REPORT_DETAIL_ID", strategy = "pjb02.team1.financialplanning.common.utils.MonthReportDetailIdGenerator")
    private String monthReportDetailId;

    @Id
    @Column(name = "MONTH_REPORT_ID", columnDefinition = "NVARCHAR(20)")
    private String monthReportId;

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

    @ManyToOne
    @JoinColumn(name = "MONTH_REPORT_ID", referencedColumnName = "MONTH_REPORT_ID")
    private MonthReport monthReport;
}
