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
@Table(name = "player")
public class PlayerEntity {

    @Id
    @Column(name = "id", nullable = false)
    private BigInteger id;

    @Column(name = "nickname", nullable = false)
    private String nickname;

    @Column(name = "money", nullable = true)
    private BigInteger money;

    @OneToMany(mappedBy = "player")
    private List<PlayerMoneyGeneratorEntity> playerMoneyGeneratorEntity;

}
