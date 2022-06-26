package ru.amorozov.barstest.dto;

import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author Aleksey Morozov
 * @since 25.06.2022
 */
public class ContractDto {
    private @Getter String contractId;
    private @Getter LocalDate date;
    private @Getter LocalDateTime updateDate;
    private @Getter boolean checkBox;

    private ContractDto(){
    }

    public static ContractDto create(String contractId,
                              LocalDate date,
                              LocalDateTime updateDate,
                              boolean checkBox){
        ContractDto dto = new ContractDto();
        dto.contractId = contractId;
        dto.date = date;
        dto.updateDate = updateDate;
        dto.checkBox = checkBox;
        return dto;
    }

    @Override
    public String toString() {
        return "ContractDto{" +
                "contractId='" + contractId + '\'' +
                ", date=" + date +
                ", updateDate=" + updateDate +
                ", checkBox=" + checkBox +
                '}';
    }
}
