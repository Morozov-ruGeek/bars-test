package ru.amorozov.barstest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.amorozov.barstest.dto.ContractDto;
import ru.amorozov.barstest.services.ContractService;
import ru.amorozov.barstest.utils.DataBaseSeeder;

import java.util.List;

/**
 * @author Aleksey Morozov
 * @since 25.06.2022
 */
@RestController
@RequestMapping("/api/v1/contracts")
public class ContractController {
    private final ContractService contractService;
    private final DataBaseSeeder dataBaseSeeder;

    @Autowired
    public ContractController(ContractService contractService,
                              DataBaseSeeder dataBaseSeeder) {
        this.contractService = contractService;
        this.dataBaseSeeder = dataBaseSeeder;
    }

    @PostMapping
    public void insertData(){
        dataBaseSeeder.insertData();
    }

    @GetMapping("/all")
    public List<ContractDto> getAllContracts(){
        return contractService.findAllContracts();
    }
}
