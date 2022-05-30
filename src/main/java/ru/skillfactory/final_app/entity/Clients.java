package ru.skillfactory.final_app.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Table(name = "Clients")
@Entity
@Data
@Getter
@Setter
@ToString

public class Clients {
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "Name")
    private String bal;

}
