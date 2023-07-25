package mateus.dio.domain.model;

import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Entity(name = "tb_account")
public class Account {

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Getter
    @Setter
    @Column(unique = true)
    private String number;
    @Getter
    @Setter
    private String agency;
    @Getter
    @Setter
    @Column(precision = 10, scale = 2)
    private BigDecimal balance;
    @Getter
    @Setter
    @Column(name = "acc_limit", precision = 10, scale = 2)
    private BigDecimal limit;

}

