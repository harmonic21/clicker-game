package ru.clicker.core.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigInteger;

@Data
@EqualsAndHashCode
public class PlayerMoneyGeneratorCompositeId implements Serializable {

    private BigInteger player;
    private BigInteger moneyGenerator;

}
