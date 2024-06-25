package pjb02.team1.financialplanning.common.mapper;

import pjb02.team1.financialplanning.dto.AccountDTO;
import pjb02.team1.financialplanning.entities.Account;

public class AccountMapper {

    public static AccountDTO toDTO(Account account) {
        return AccountDTO.builder()
                .userId(account.getUserId())
                .userName(account.getUserName())
                .fullName(account.getFullName())
                .email(account.getEmail())
                .password(account.getPassword())
                .phoneNumber(account.getPhoneNumber())
                .dob(account.getDob())
                .address(account.getAddress())
                .departmentId(account.getDepartmentId())
                .positionId(account.getPositionId())
                .role(account.getRole())
                .userStatus(account.getUserStatus())
                .note(account.getNote())
                .createId(account.getCreateId())
                .updateId(account.getUpdateId())
                .createDateTime(account.getCreateDateTime())
                .updateDateTime(account.getUpdateDateTime())
                .deleteFlag(account.isDeleteFlag())
                .build();
    }

    public static Account toEntity(AccountDTO accountDTO) {
        return Account.builder()
                .userId(accountDTO.getUserId())
                .userName(accountDTO.getUserName())
                .fullName(accountDTO.getFullName())
                .email(accountDTO.getEmail())
                .password(accountDTO.getPassword())
                .phoneNumber(accountDTO.getPhoneNumber())
                .dob(accountDTO.getDob())
                .address(accountDTO.getAddress())
                .departmentId(accountDTO.getDepartmentId())
                .positionId(accountDTO.getPositionId())
                .role(accountDTO.getRole())
                .userStatus(accountDTO.getUserStatus())
                .note(accountDTO.getNote())
                .createId(accountDTO.getCreateId())
                .updateId(accountDTO.getUpdateId())
                .createDateTime(accountDTO.getCreateDateTime())
                .updateDateTime(accountDTO.getUpdateDateTime())
                .deleteFlag(accountDTO.isDeleteFlag())
                .build();
    }
}