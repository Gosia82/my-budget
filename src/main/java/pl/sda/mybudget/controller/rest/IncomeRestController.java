package pl.sda.mybudget.controller.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.mybudget.model.Income;
import pl.sda.mybudget.model.enumeration.IncomeType;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/rest/incomes")
public class IncomeRestController {
    @GetMapping
    List<Income> getAllIncomes(){
        return List.of(
                new Income(1000, LocalDate.now(),"od męża", IncomeType.MOPS),
                new Income(500000, LocalDate.now(),"500+", IncomeType.MOPS)
        );
    }
}
