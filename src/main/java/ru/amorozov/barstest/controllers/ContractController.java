package ru.amorozov.barstest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.amorozov.barstest.dto.ContractDto;
import ru.amorozov.barstest.services.ContractService;

import java.util.List;

/**
 * @author Aleksey Morozov
 * @since 25.06.2022
 */
@RestController
@RequestMapping("/api/v1/contracts")
public class ContractController {
    private final ContractService contractService;

    @Autowired
    public ContractController(ContractService contractService) {
        this.contractService = contractService;
    }

    @GetMapping("/all")
    public List<ContractDto> getAllContracts(){
        return contractService.findAllContracts();
    }
}
