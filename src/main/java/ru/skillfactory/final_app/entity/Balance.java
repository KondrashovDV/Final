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
@Table(name = "bal")
@Entity
@Data
@Getter
@Setter
@ToString
public class Balance {

        @Id
        @Column(name = "user_id")
        private Long id;
        @Column(name = "cur_bal")
        private BigDecimal bal;

    }

