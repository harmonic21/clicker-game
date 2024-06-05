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
@Table(name = "player_money_generator")
public class PlayerMoneyGeneratorEntity {

    @Id
    private BigInteger id;

    @Column(name = "player_id", nullable = false)
    private BigInteger playerId;

    @Column(name = "generator_id", nullable = false)
    private BigInteger generatorId;

    @Column(name = "count")
    private BigInteger count;

}
