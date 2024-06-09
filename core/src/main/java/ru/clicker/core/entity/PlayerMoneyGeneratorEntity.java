package ru.clicker.core.entity;


import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@Table(name = "player_money_generator")
@IdClass(PlayerMoneyGeneratorCompositeId.class)
public class PlayerMoneyGeneratorEntity {

    @Id
    @ManyToOne
    @JoinColumn(name = "player_id", referencedColumnName = "id")
    private PlayerEntity player;

    @Id
    @ManyToOne
    @JoinColumn(name = "generator_id", referencedColumnName = "id")
    private MoneyGeneratorEntity moneyGenerator;

    @Column(name = "count", nullable = true)
    private BigInteger count;

}
