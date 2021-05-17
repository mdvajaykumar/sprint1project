package com.capgemini.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.entites.LoanApprovalDepartment;
import com.capgemini.repository.ILoanApprovalDepartmentRepository;

@Service
public class LoanApprovalDepartmentService implements ILoanApprovalDepartmentService  {
	
	@Autowired
	ILoanApprovalDepartmentRepository iloanApprovalDepartmentRepository;

	@Override
	public boolean addofficer(LoanApprovalDepartment loanApprovalDepartemnt) {
		iloanApprovalDepartmentRepository.save(loanApprovalDepartemnt);
		return true;
	}

	@Override
	public boolean isValidFinanceOfficer(String username, String password) {
		return iloanApprovalDepartmentRepository.findByUsernameAndPassword(username, password)!=null;
		
	}

}
