package ru.amorozov.barstest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.amorozov.barstest.dto.ContractDto;
import ru.amorozov.barstest.repositories.ContractRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Aleksey Morozov
 * @since 25.06.2022
 */
@Service
public class ContractServiceImpl implements ContractService {
    private final ContractRepository contractRepository;

    @Autowired
    public ContractServiceImpl(ContractRepository contractRepository) {
        this.contractRepository = contractRepository;
    }

    @Override
    public List<ContractDto> findAllContracts() {
        return contractRepository.findAll().stream()
                .map(c -> ContractDto.create(c.getContractId(), c.getContractDate(), c.getUpdatedAt().toLocalDate(), checkByUpdateDate(c.getUpdatedAt())))
                .collect(Collectors.toList());
    }

    private boolean checkByUpdateDate(LocalDateTime updateAt){
        return LocalDate.now().minusDays(60L).isAfter(updateAt.toLocalDate());
    }
}
