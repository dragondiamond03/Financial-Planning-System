package pjb02.team1.financialplanning.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class AccountDTO extends BaseDTO {
    private int userId;
    private String userName;
    private String fullName;
    private String email;
    private String password;
    private String phoneNumber;
    private LocalDate dob;
    private String address;
    private int departmentId;
    private int positionId;
    private int role;
    private int userStatus;
    private String note;
}
