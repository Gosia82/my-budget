package pl.sda.mybudget.controller.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.mybudget.model.Expense;
import pl.sda.mybudget.service.ExpenseService;

import java.util.List;

@RestController
@RequestMapping("/rest/expenses")
public class ExspenseRestController {
    private final ExpenseService expenseService;

    public ExspenseRestController(final ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @GetMapping
    List<Expense> getAllExpenses(){
        return expenseService.findAllExpenses();
    }
}
