package com.capgemini.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.capgemini.entites.LoanApprovalDepartment;
@Repository
public interface ILoanApprovalDepartmentRepository  extends JpaRepository<LoanApprovalDepartment, Integer>{
 
	public LoanApprovalDepartment findByUsernameAndPassword(String username, String password);
}
