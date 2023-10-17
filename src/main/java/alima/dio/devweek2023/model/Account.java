package alima.dio.devweek2023.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "tb_account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)    
    private String number;
    private String agency;

    @Column(precision = 2, scale = 13)
    private BigDecimal balance;

    @Column(name = "additional_limit", precision = 2, scale = 13)
    private BigDecimal limit;




    
}