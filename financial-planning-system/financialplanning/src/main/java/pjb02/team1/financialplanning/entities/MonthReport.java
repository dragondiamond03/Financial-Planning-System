package pjb02.team1.financialplanning.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDate;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@Entity
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "MONTH_REPORT")
public class MonthReport extends BaseEntity{

    @Id
    @Column(name = "MONTH_REPORT_ID",columnDefinition = "NVARCHAR(20)")
    @GeneratedValue(generator = "MONTH_REPORT_ID")
    @GenericGenerator(name = "MONTH_REPORT_ID", strategy = "pjb02.team1.financialplanning.common.utils.MonthReportIdGenerator")
    private String monthReportId;

    @Column(name = "MONTH_REPORT_NAME",columnDefinition = "NVARCHAR(255)")
    private String monthReportName;

    @Column(name = "MONTH",columnDefinition = "DATE")
    private LocalDate month;

    @Column(name = "DEPARTMENT_ID",columnDefinition = "INT")
    private int departmentId;

    @Column(name = "REPORT_STATUS",columnDefinition = "INT")
    private int reportStatus;

    @Column(name = "VERSION",columnDefinition = "INT")
    private int version;

    @ManyToOne
    @JoinColumn(name = "TERM_ID", referencedColumnName = "TERM_ID")
    private Term term;

    @OneToMany(mappedBy = "monthReport", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<MonthReportDetail> monthReportDetails;
}
