package ru.amorozov.barstest.services;

import ru.amorozov.barstest.dto.ContractDto;

import java.util.List;

/**
 * @author Aleksey Morozov
 * @since 25.06.2022
 */
public interface ContractService {
    List<ContractDto> findAllContracts();
}
