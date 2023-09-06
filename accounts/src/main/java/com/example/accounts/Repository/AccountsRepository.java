package com.example.accounts.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.accounts.Model.Accounts;

@Repository
public interface AccountsRepository extends CrudRepository<Accounts,Integer>{

	Accounts findByCustomerId(int customerId);
}
