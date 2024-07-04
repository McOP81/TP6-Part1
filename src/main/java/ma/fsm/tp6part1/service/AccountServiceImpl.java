package ma.fsm.tp6part1.service;

import lombok.AllArgsConstructor;
import ma.fsm.tp6part1.dto.BankAccountRequestDTO;
import ma.fsm.tp6part1.dto.BankAccountResponseDTO;
import ma.fsm.tp6part1.entities.BankAccount;
import ma.fsm.tp6part1.mappers.AccountMapper;
import ma.fsm.tp6part1.repositories.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.UUID;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {
    @Autowired
    private BankAccountRepository bankAccountRepository;
    @Autowired
    private AccountMapper accountMapper;

    @Override
    public BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO) {
        BankAccount bankAccount = BankAccount.builder()
                .id(UUID.randomUUID().toString())
                .createdAt(new Date())
                .balance(bankAccountDTO.getBalance())
                .type(bankAccountDTO.getType())
                .currency(bankAccountDTO.getCurrency())
                .build();
        BankAccount saveBankAccount = bankAccountRepository.save(bankAccount);
//        BankAccountResponseDTO bankAccountResponseDTO = BankAccountResponseDTO.builder()
//                .id(saveBankAccount.getId())
//                .createdAt(saveBankAccount.getCreatedAt())
//                .balance(saveBankAccount.getBalance())
//                .type(saveBankAccount.getType())
//                .currency(saveBankAccount.getCurrency())
//                .build();
        BankAccountResponseDTO bankAccountResponseDTO = accountMapper.fromBankAccount(saveBankAccount);
        return bankAccountResponseDTO;
    }
}
