package pl.sda.mybudget.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.mybudget.model.Expense;

public interface ExpenseRepository extends JpaRepository<Expense,Long> {
}
