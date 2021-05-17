package com.capgemini.services;


import com.capgemini.entites.LoanApprovalDepartment;

public interface ILoanApprovalDepartmentService {
	
  public boolean isValidFinanceOfficer(String username, String password);
  public boolean addofficer(LoanApprovalDepartment loanApprovalDepartment);
}
