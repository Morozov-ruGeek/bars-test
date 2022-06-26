package ru.amorozov.barstest.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.amorozov.barstest.entities.Contract;

import java.util.List;

/**
 * @author Aleksey Morozov
 * @since 25.06.2022
 */
@Repository
public interface ContractRepository extends CrudRepository<Contract, Long> {
    List<Contract> findAll();
}
