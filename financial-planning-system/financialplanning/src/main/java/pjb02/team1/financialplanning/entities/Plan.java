package pjb02.team1.financialplanning.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.GenericGenerator;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@Entity
@SuperBuilder
@IdClass(PlanPK.class)
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "PLAN")
public class Plan extends BaseEntity{

    @Id
    @GeneratedValue(generator = "PLAN_ID")
    @GenericGenerator(name = "PLAN_ID", strategy = "pjb02.team1.financialplanning.common.utils.PlanIdGenerator")
    @Column(name = "PLAN_ID", columnDefinition = "NVARCHAR(20)")
    private String planId;

    @Id
    @Column(name = "TERM_ID", columnDefinition = "NVARCHAR(20)")
    private String termId;

    @Column(name = "PLAN_NAME", columnDefinition = "NVARCHAR(255)")
    private String planName;

    @Column(name = "DEPARTMENT_ID", columnDefinition = "INT")
    private int departmentID;

    @Column(name = "PLAN_STATUS", columnDefinition = "INT")
    private int planStatus;

    @Column(name = "VERSION", columnDefinition = "INT")
    private int version;

    @ManyToOne
    @JoinColumn(name = "TERM_ID", referencedColumnName = "TERM_ID")
    private Term term;

    @OneToMany(mappedBy = "plan", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<PlanDetail> planDetails;
}
