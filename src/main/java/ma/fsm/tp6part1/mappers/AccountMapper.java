package ma.fsm.tp6part1.mappers;

import com.fasterxml.jackson.databind.util.BeanUtil;
import ma.fsm.tp6part1.dto.BankAccountResponseDTO;
import ma.fsm.tp6part1.entities.BankAccount;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class AccountMapper {
    public BankAccountResponseDTO fromBankAccount(BankAccount bankAccount) {
        BankAccountResponseDTO bankAccountResponseDTO = new BankAccountResponseDTO();
        BeanUtils.copyProperties(bankAccount, bankAccountResponseDTO);
        return bankAccountResponseDTO;
    }
}
