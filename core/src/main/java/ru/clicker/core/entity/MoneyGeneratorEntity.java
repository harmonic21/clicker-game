package ru.clicker.core.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@Table(name = "money_generator")
public class MoneyGeneratorEntity {

    @Id
    private BigInteger id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "cost", nullable = false)
    private BigInteger cost;

    @Column(name = "value", nullable = false)
    private BigInteger value;

}
