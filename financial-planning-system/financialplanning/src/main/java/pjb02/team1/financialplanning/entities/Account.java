package pjb02.team1.financialplanning.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@Entity
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ACCOUNT")
public class Account extends BaseEntity{

    @Id
    @Column(name = "ACCOUNT_ID",columnDefinition = "INT")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    @Column(name = "USER_NAME",columnDefinition = "NVARCHAR(50)")
    @NotNull
    private String userName;

    @Column(name = "FULL_NAME",columnDefinition = "NVARCHAR(100)")
    @NotNull
    private String fullName;

    @Column(name = "EMAIL",columnDefinition = "NVARCHAR(100)")
    @NotNull
    private String email;

    @Column(name = "PASSWORD",columnDefinition = "NVARCHAR(255)")
    @NotNull
    private String password;

    @Column(name = "PHONE_NUMBER",columnDefinition = "NVARCHAR(20)")
    @NotNull
    private String phoneNumber;

    @Column(name = "DOB",columnDefinition = "DATE")
    @NotNull
    private LocalDate dob;

    @Column(name = "ADDRESS",columnDefinition = "NVARCHAR(255)")
    private String address;

    @Column(name = "DEPARTMENT_ID",columnDefinition = "INT")
    @NotNull
    private int departmentId;

    @Column(name = "POSITION_ID",columnDefinition = "INT")
    @NotNull
    private int positionId;

    @Column(name = "ROLE",columnDefinition = "INT")
    @NotNull
    private int role;

    @Column(name = "USER_STATUS",columnDefinition = "INT")
    private int userStatus;

    @Column(name = "NOTE",columnDefinition = "NVARCHAR(255)")
    private String note;

}
