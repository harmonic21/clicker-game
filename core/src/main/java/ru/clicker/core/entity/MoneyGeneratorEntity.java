package ru.clicker.core.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;
import java.util.List;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@Table(name = "money_generator")
public class MoneyGeneratorEntity {

    @Id
    @Column(name = "id", nullable = false)
    private BigInteger id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "cost", nullable = false)
    private BigInteger cost;

    @Column(name = "value", nullable = false)
    private BigInteger value;

    @OneToMany(mappedBy = "moneyGenerator")
    private List<PlayerMoneyGeneratorEntity> playerMoneyGeneratorEntity;

}
