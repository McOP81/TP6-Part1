package ma.fsm.tp6part1.service;

import ma.fsm.tp6part1.dto.BankAccountRequestDTO;
import ma.fsm.tp6part1.dto.BankAccountResponseDTO;
import ma.fsm.tp6part1.entities.BankAccount;

public interface AccountService {
    public BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);

    BankAccountResponseDTO updateAccount(String id, BankAccountRequestDTO bankAccountDTO);
}
