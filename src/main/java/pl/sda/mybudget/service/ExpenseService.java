package pl.sda.mybudget.service;

import pl.sda.mybudget.model.Expense;

import java.util.List;

public interface ExpenseService {
    List<Expense> findAllExpenses();
}
