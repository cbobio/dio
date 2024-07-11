package me.dio.domain.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
@Data
@Entity(name = "tb_account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "number", nullable = false, length = 255, unique = true)
    private String number;

    @Column(name = "agency", nullable = false, length = 255)
    private String agency;

    @Column(name = "balance", nullable = false, length = 300, scale = 2, precision = 13)
    private BigDecimal balance;

    @Column(name = "additional_limit", nullable = false, length = 300, scale = 2, precision = 13)
    private BigDecimal limit;
}
