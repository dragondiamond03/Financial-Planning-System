package pjb02.team1.financialplanning.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
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
@Table(name = "TERM")
public class Term extends BaseEntity {

    @Id
    @Column(name = "TERM_ID", columnDefinition = "INT")
    @GeneratedValue(generator = "TERM_ID")
    @GenericGenerator(name = "TERM_ID", strategy = "pjb02.team1.financialplanning.common.utils.TermIdGenerator")
    private int termId;

    @Column(name = "TERM_NAME", columnDefinition = "NVARCHAR(255)")
    @NotNull
    private String termName;

    @Column(name = "DURATION", columnDefinition = "INT")
    private int duration;

    @Column(name = "START_DATE", columnDefinition = "DATE")
    @NotNull
    private LocalDate startDate;

    @Column(name = "PLAN_DUE_DATE", columnDefinition = "DATE")
    @NotNull
    private LocalDate planDueDate;

    @Column(name = "REPORT_DUE_DATE", columnDefinition = "DATE")
    @NotNull
    private LocalDate reportDueDate;

    @Column(name = "TERM_STATUS", columnDefinition = "INT")
    private int termStatus;

    @OneToMany(mappedBy = "term", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<MonthReport> monthReports;

    @OneToMany(mappedBy = "term", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Plan> plans;
}
