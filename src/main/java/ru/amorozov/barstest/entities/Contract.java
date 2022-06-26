package ru.amorozov.barstest.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author Aleksey Morozov
 * @since 25.06.2022
 */
@Table(name = "contracts")
@NoArgsConstructor
@AllArgsConstructor
public class Contract {
    @Id
    private @Getter @Setter Long id;
    private @Getter @Setter LocalDate contractDate;
    private @Getter @Setter String contractId;
    private @Getter @Setter LocalDateTime updatedAt;
}
