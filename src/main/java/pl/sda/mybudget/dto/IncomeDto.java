package pl.sda.mybudget.dto;

import lombok.Value;
import pl.sda.mybudget.model.enumeration.IncomeType;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDate;

@Value
public class IncomeDto {
     Long id;
     long amountInPolishGrosz;
     LocalDate incomeDate;
     String incomeSource;
     String incomeType;
}
