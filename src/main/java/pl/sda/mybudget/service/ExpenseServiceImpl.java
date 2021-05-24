package pl.sda.mybudget.service;

import org.springframework.stereotype.Service;
import pl.sda.mybudget.model.Expense;
import pl.sda.mybudget.repository.ExpenseRepository;

import java.util.List;
@Service
public class ExpenseServiceImpl implements ExpenseService{

   private final ExpenseRepository expenseRepository;

    public ExpenseServiceImpl(final ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    @Override
    public List<Expense> findAllExpenses() {
        return expenseRepository.findAll() ;
    }
}
