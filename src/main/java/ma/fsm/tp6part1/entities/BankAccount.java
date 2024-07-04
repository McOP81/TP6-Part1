package ma.fsm.tp6part1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;
import ma.fsm.tp6part1.enums.AccountType;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
@Builder
public class BankAccount {
    @Id
    private String id;
    private Date createdAt;
    private Double balance;
    private String currency;
    @Enumerated(EnumType.STRING)
    private AccountType type;
    @ManyToOne
    private Customer customer;
}
