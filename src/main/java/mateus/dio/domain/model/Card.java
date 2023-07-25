package mateus.dio.domain.model;

import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Entity(name = "tb_card")
public class Card {
    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Getter
    @Setter
    @Column(unique = true)
    private String number;
    @Getter
    @Setter
    @Column(name = "card_limit",scale = 7, precision = 2)
    private BigDecimal limit;

}
