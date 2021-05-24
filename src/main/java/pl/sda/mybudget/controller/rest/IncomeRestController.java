package pl.sda.mybudget.controller.rest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.sda.mybudget.model.Income;
import pl.sda.mybudget.model.enumeration.IncomeType;
import pl.sda.mybudget.service.IncomeService;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/rest/incomes")
public class IncomeRestController {

    private final IncomeService incomeService;

    public IncomeRestController(final IncomeService incomeService) {
        this.incomeService = incomeService;
    }

    // Select all
    @GetMapping
    List<Income> getAllIncomes() {
        return incomeService.findAllIncomes();
    }

    // Select by id
    // /rest/incomes/1
    // /rest/incomes/2
    // /rest/incomes/n - id of income goes here
    @GetMapping("/{id}")
    Income findById(@PathVariable("id") Long idik) {
        return incomeService.findIncomeById(idik);

    }

    @PostMapping
    Income createNewIncome(@RequestBody Income incomeToSave) {
        return incomeService.saveIncome(incomeToSave);
    }

    @DeleteMapping("/{id}")
    void deleteIncome(@PathVariable("id") Long idik) {
        incomeService.deleteIncomeById(idik);
    }


    @PutMapping("/{id}")
    Income prepareEditIncome(Model model, @PathVariable("id") Long idik){
       Income incomeToEdit = incomeService.findIncomeById(idik);
       model.addAttribute("income", incomeToEdit);
        return incomeService.editIncome(idik);

     }
    @PostMapping("/{id}")
    Income processEditIncome(@PathVariable ("id") Long idik, @PathVariable Long amountInpolishGrosz, @PathVariable String incomeSource, @PathVariable LocalDate incomeDate, @PathVariable IncomeType incomeType){
        Income editIncome = incomeService.findIncomeById(idik);
        editIncome.setAmountInPolishGrosz(amountInpolishGrosz);
        editIncome.setIncomeSource(incomeSource);
        editIncome.setIncomeDate(incomeDate);
        editIncome.setIncomeType(incomeType);
        return incomeService.editIncome(idik);
    }

}