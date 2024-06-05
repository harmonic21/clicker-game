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
@Table(name = "players")
public class PlayerEntity {

    @Id
    private BigInteger id;

    @Column(name = "nickname", nullable = false)
    private String nickname;

    @Column(name = "money")
    private BigInteger money;

}
